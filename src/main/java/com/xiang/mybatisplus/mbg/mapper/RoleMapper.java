package com.xiang.mybatisplus.mbg.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.xiang.mybatisplus.mbg.model.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author htx
 * @since 2022-03-29
 */
@Mapper
@DS("slave_1")
public interface RoleMapper extends BaseMapper<Role> {


}
