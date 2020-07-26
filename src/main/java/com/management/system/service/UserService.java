package com.management.system.service;

import com.management.system.entity.User;
import com.management.system.utils.response.ApiResponse;

/**
 * @author：xiexiaolong.
 * @date: 2020/7/26
 */
public interface UserService {
    /**
     * 登录
     * @param username
     * @return
     */
    ApiResponse<User> login(String username,String password);
}
