package com.xiang.mybatisplus.mbg.controller;


import com.xiang.mybatisplus.mbg.mapper.RoleMapper;
import com.xiang.mybatisplus.mbg.model.Role;
import com.xiang.mybatisplus.mbg.service.RoleService;
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
@RequestMapping("/mbg/role")
public class RoleController {

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private RoleService roleService;

    @RequestMapping("/t1")
    public Object t1(){
        Role role = new Role();
        role.setRoleId("123");
        role.setRoleName("zs");
        return roleMapper.insert(role);
    }


    @RequestMapping("/t2")
    public Object t2(){
        return roleService.list();
    }


}

