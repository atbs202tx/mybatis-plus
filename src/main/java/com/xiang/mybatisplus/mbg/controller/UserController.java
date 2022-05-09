package com.xiang.mybatisplus.mbg.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiang.mybatisplus.mbg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author htx
 * @since 2022-03-29
 */
@RestController
@RequestMapping("/mbg/user")
public class UserController {
    @Autowired
    private UserService userService;



    @RequestMapping("/t1")
    public Object t1(){
        return userService.list();
    }



}

