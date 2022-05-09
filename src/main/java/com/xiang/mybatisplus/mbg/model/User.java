package com.xiang.mybatisplus.mbg.model;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author htx
 * @since 2022-03-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    private String userId;

    private String userName;

    private String loginName;

    private String loginPwd;

    private String status;

    private String lastUpdateTime;

    private String createTime;


}
