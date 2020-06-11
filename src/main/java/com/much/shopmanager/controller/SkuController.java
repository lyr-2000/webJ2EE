package com.much.shopmanager.controller;

import com.much.shopmanager.entity.Sku;
import com.much.shopmanager.service.SkuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Sku)表控制层
 *
 * @author makejava
 * @since 2020-06-07 01:44:06
 */
@CrossOrigin
@RestController
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
    @GetMapping("product")
    public Sku selectOne(@RequestParam Integer id) {
        return this.skuService.queryById(id);
    }

    @GetMapping("product/sku")
    public List<Sku> queryList(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) Integer categoryId,
            @RequestParam(required = false) Integer brandId
    ) {
        //todo:模糊查询
        // like % title %
        return null;

    }
    /**
     *
     * 业务：
     * 1. 标题模糊查询+ 分页
     * 2. 根据id更新
     * 3. 添加  SKU 以及库存记录
     *
     *
     * */

}