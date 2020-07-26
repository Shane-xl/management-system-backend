package com.management.system.controller;

import com.management.system.domain.dto.UserDto;
import com.management.system.domain.entity.User;
import com.management.system.service.UserService;
import com.management.system.utils.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author：xiexiaolong.
 * @date: 2020/7/26
 */
@RestController
@CrossOrigin // 允许跨域
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ApiResponse<User> login(@RequestBody UserDto userDto) {
        return userService.login(userDto);
    }
}
