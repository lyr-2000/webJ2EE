package com.much.shopmanager.controller;

import com.much.shopmanager.entity.Spu;
import com.much.shopmanager.pojo.dto.Result;
import com.much.shopmanager.service.SpuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Spu)表控制层
 *
 * @author makejava
 * @since 2020-06-07 01:44:06
 */
@Slf4j
@CrossOrigin
@RestController
@RequestMapping("spu")
public class SpuController {
    /**
     * 服务对象
     */
    @Resource
    private SpuService spuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public Spu selectOne(@RequestParam Integer id) {
        return this.spuService.queryById(id);
    }

    @GetMapping("/spu_info")
    public List<Spu> selectListFirstPage(@RequestParam Integer page,@RequestParam Integer size ) {
        log.info("收到请求 {},{}",page,size);
        Assert.isTrue(page>0&&size>1,"参数不正确");
        List<Spu> result = spuService.queryShowSpu((page-1)*size,size);
        log.info("result {}",result);
        return result;
    }

    @GetMapping("/spu_info/_count")
    public Result<Long> countListData() {
        //获得总记录数量
        return Result.of(spuService.countTotalRecord());
    }


    @PutMapping("/spu/saleable")
    public Result<Spu> updateStatus(@RequestBody Spu spu) {
        log.info("请求参数，{}",spu);
        // Spu spu = new Spu();
        // spu.setSaleable(saleable.toString());
        // spu.setId(id);
        return Result.of(spuService.update(spu));

    }


}