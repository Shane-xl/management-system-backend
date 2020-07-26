package com.management.system.mapper;

import com.management.system.entity.User;

/**
 * @author：xiexiaolong.
 * @date: 2020/7/26
 */
public interface UserMapper {
    /**
     * 根据用户名查找用户是否存在
     * @param username
     * @return
     */
    User findByUserName(String username);
}
