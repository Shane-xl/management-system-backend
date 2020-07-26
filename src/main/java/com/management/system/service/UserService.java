package com.management.system.service;

import com.management.system.domain.dto.UserDto;
import com.management.system.domain.entity.User;
import com.management.system.utils.response.ApiResponse;

/**
 * @author：xiexiaolong.
 * @date: 2020/7/26
 */
public interface UserService {
    /**
     * 登录
     *
     * @param userDto
     * @return
     */
    ApiResponse<User> login(UserDto userDto);
}
