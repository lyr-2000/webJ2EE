package com.much.shopmanager.controller;

import com.much.shopmanager.entity.Category;
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

    @PostMapping("/spu")
    public Result<Spu> insertOrUpdateProduct(
            @RequestParam String brand,
            @RequestParam String category,
            @RequestParam String spuProductName
    ) {
            try{
                Spu spu = spuService.insertOrUpdate(brand, category, spuProductName);;
                return Result.of(spu);
            }catch (Exception ex) {
                Result result = new Result();
                result.setCode(500);
                return result;
            }

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

    @GetMapping("/spu_info/category")
    public Result<List<Spu>> selectByCategory(@RequestParam Integer categoryId,@RequestParam Integer page,@RequestParam Integer size) {
        Spu spu = new Spu();
        spu.setCategoryId(categoryId);
        Result<List<Spu>> result = Result.of(spuService.queryByExample(spu,page,size));
        result.setTotal(spuService.countByExample(spu));
        return  result;
    }

    @GetMapping("/spu_info/_search")
    public Result<List<Spu>> selectByFuzzyName(@RequestParam String brandName,
                                       @RequestParam String categoryName,
                                       @RequestParam String title,
                                       @RequestParam Integer page,@RequestParam Integer size) {
        Result<List<Spu>> result = Result.of(spuService.queryByFuzzyName(brandName, categoryName,title, page, size));
        result.setTotal(spuService.countByName(brandName, categoryName, title));
        return result;
    }


}