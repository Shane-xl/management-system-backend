package com.management.system.service.impl;

import com.management.system.domain.dto.UserDTO;
import com.management.system.domain.entity.User;
import com.management.system.mapper.UserMapper;
import com.management.system.service.UserService;
import com.management.system.utils.response.ApiResponse;
import com.management.system.utils.response.enums.ReturnCode;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author：xiexiaolong.
 * @date: 2020/7/26
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public ApiResponse login(UserDTO userDto) {
        if (userDto == null) {
            return ApiResponse.fail(ReturnCode.PARAMS_ERROR);
        }
        User user = userMapper.findByUserName(userDto.getUsername());
        if (ObjectUtils.isEmpty(user)) {
            return ApiResponse.fail(ReturnCode.USER_IS_NOT);
        } else {
            if (user.getPassword().equals(userDto.getPassword())) {
                return ApiResponse.success(user);
            } else {
                return ApiResponse.fail(ReturnCode.PASSWORD_ERROR);
            }
        }
    }
}
