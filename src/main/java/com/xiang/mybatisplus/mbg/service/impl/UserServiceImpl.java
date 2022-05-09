package com.xiang.mybatisplus.mbg.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.xiang.mybatisplus.mbg.model.User;
import com.xiang.mybatisplus.mbg.mapper.UserMapper;
import com.xiang.mybatisplus.mbg.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author htx
 * @since 2022-03-29
 */
@Service
@DS("master")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
