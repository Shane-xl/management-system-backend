package com.management.system.controller;

import com.management.system.domain.dto.UserDTO;
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
    public ApiResponse login(@RequestBody(required = false) UserDTO userDto) {
        return userService.login(userDto);
    }
}
