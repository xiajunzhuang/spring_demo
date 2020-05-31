package com.xiajunzhuang.spring.service.impl;

import com.xiajunzhuang.spring.service.IUserService;
import org.springframework.stereotype.Component;

@Component("userService")
public class UserServiceImpl implements IUserService {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        System.out.println("set username" + username);
        this.username = username;
    }

    @Override
    public void addUser() {
        System.out.println("添加用户" + username);
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
    }

    public UserServiceImpl() {
        System.out.println("create userService object...");
    }
}
