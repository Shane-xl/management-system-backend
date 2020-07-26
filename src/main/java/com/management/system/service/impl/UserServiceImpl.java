package com.management.system.service.impl;

import com.management.system.entity.User;
import com.management.system.mapper.UserMapper;
import com.management.system.service.UserService;
import com.management.system.utils.response.ApiResponse;
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
    public ApiResponse<User> login(String username,String password) {
        User user = userMapper.findByUserName(username);
        if (ObjectUtils.isEmpty(user)) {
            return ApiResponse.fail(201, "用户不存在");
        } else {
            if (user.getPassword().equals(password)) {
                return ApiResponse.success(user);
            } else {
                return ApiResponse.fail(202, "密码输入错误");
            }
        }
    }
}
