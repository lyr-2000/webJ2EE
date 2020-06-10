package com.much.shopmanager.controller;

import com.much.shopmanager.entity.Spu;
import com.much.shopmanager.service.SpuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Spu)表控制层
 *
 * @author makejava
 * @since 2020-06-07 01:44:06
 */
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
    public Spu selectOne(Integer id) {
        return this.spuService.queryById(id);
    }

}