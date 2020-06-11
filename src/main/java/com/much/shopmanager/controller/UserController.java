package com.much.shopmanager.controller;

import com.much.shopmanager.entity.User;
import com.much.shopmanager.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-06-09 00:47:01
 */
@RestController
@CrossOrigin
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param name 主键
     * @return 单条数据
     */
    @GetMapping("/user/{name}")
    public User selectOne(  @PathVariable String name) {
        return this.userService.queryById(name);
    }

}