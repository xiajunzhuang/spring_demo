package com.xiajunzhuang.spring;

import com.xiajunzhuang.spring.service.IUserService;
import com.xiajunzhuang.spring.service.impl.UserServiceImpl;

public class UserServiceStaticFactory {
    public static IUserService createUserService(){
        return new UserServiceImpl();
    }
}
