package com.xiang.mybatisplus.mbg.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiang.mybatisplus.mbg.service.AService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author htx
 * @since 2022-05-09
 */
@RestController
@RequestMapping("/mbg/a")
public class AController {

    @Autowired
    private AService aService;

    @RequestMapping("/list")
    public Object list(){
        //模糊条件查询
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("name","z");
        //创建分页实例，
        Page page = new Page(1,3);
        return aService.page(page,queryWrapper);
        //tset
    }



}

