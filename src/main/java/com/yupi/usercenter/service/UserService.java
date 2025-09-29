package com.yupi.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.usercenter.model.domain.User;


public interface UserService extends IService<User> {

    /**
     *
     * @param userAccount 用户账户
     * @param password 用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String password, String checkPassword);
}
