package com.much.shopmanager.controller;

import com.much.shopmanager.entity.SpecParam;
import com.much.shopmanager.service.SpecParamService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SpecParam)表控制层
 *
 * @author makejava
 * @since 2020-06-07 01:44:06
 */@CrossOrigin
@RestController
public class SpecParamController {
    /**
     * 服务对象
     */
    @Resource
    private SpecParamService specParamService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("product_param/{id}")
    public SpecParam selectOne(@PathVariable Integer id) {
        return this.specParamService.queryById(id);
    }

}