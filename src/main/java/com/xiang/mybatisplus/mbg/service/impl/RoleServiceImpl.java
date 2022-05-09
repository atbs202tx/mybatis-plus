package com.xiang.mybatisplus.mbg.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.xiang.mybatisplus.mbg.model.Role;
import com.xiang.mybatisplus.mbg.mapper.RoleMapper;
import com.xiang.mybatisplus.mbg.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author htx
 * @since 2022-03-29
 *
 */

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
