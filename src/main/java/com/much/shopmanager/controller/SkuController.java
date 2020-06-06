package com.much.shopmanager.controller;

import com.much.shopmanager.entity.Sku;
import com.much.shopmanager.service.SkuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Sku)表控制层
 *
 * @author makejava
 * @since 2020-06-07 01:44:06
 */
@RestController
@RequestMapping("sku")
public class SkuController {
    /**
     * 服务对象
     */
    @Resource
    private SkuService skuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Sku selectOne(Integer id) {
        return this.skuService.queryById(id);
    }

}