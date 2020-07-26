package com.management.system.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @author：xiexiaolong.
 * @date: 2020/7/26
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private String id;
    private String username;
    private String realname;
    private String password;
    private String sex;
    private String status;
    private Date regsterTime;
}
