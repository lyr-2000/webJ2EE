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
 */
@RestController
@RequestMapping("specParam")
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
    @GetMapping("selectOne")
    public SpecParam selectOne(Integer id) {
        return this.specParamService.queryById(id);
    }

}