package com.management.system.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author：xiexiaolong.
 * @date: 2020/7/26
 */
@Setter
@Getter
public class UserDto implements Serializable {
    private String username;
    private String password;
}
