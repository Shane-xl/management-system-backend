package com.management.system.service;

import com.management.system.domain.dto.UserDTO;
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
    ApiResponse login(UserDTO userDto);
}
