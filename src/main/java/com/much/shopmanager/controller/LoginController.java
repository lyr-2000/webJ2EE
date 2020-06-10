package com.much.shopmanager.controller;

import com.google.common.collect.Maps;
import com.much.shopmanager.common.util.JwtUtil;
import com.much.shopmanager.entity.User;
import com.much.shopmanager.pojo.dto.Result;
import com.much.shopmanager.service.UserService;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.time.Duration;
import java.util.Map;

/**
 * @Author lyr
 * @create 2020/6/9 1:48
 */
@RestController
public class LoginController {
    /**
     * 发放登录令牌
     * @param user
     * @return
     */
    @PostMapping("/login")
    public Result<String> getToken(@RequestBody @Valid User user) {
        User mysqlUser = userService.queryById(user.getName());
        if(mysqlUser!=null && user.getName().equals(mysqlUser.getName()) && user.getPassword().equals(mysqlUser.getPassword())) {
            Map<String, String> map = Maps.newHashMap();
            map.put("name",user.getName());
            String token = JwtUtil.createJWT(map, Duration.ofDays(2).toMillis());
            return Result.of(token);
        }
        return Result.<String>builder()
                .code(404)
                .build();


    }

    @GetMapping("/login")
    public Result<String> getToken2(@RequestParam String name,@RequestParam String password) {
        User mysqlUser = userService.queryById(name);
        if(mysqlUser!=null && name.equals(mysqlUser.getName()) && password.equals(mysqlUser.getPassword())) {
            Map<String, String> map = Maps.newHashMap();
            map.put("name",name);
            String token = JwtUtil.createJWT(map, Duration.ofDays(2).toMillis());
            return Result.of(token);
        }
        return Result.<String>builder()
                .code(404)
                .build();


    }
    @Resource
    private UserService userService;
}
