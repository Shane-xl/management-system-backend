package com.management.system.controller;

import com.management.system.entity.User;
import com.management.system.service.UserService;
import com.management.system.utils.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：xiexiaolong.
 * @date: 2020/7/26
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ApiResponse<User> login(String username, String password) {
        return userService.login(username, password);
    }
}
