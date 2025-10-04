package com.yupi.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author knyn
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 4881950103942478985L;

    private String userAccount;

    private String userPassword;
}
