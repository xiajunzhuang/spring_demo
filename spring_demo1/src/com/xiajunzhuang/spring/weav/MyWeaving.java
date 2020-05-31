package com.xiajunzhuang.spring.weav;

import com.xiajunzhuang.spring.aspect.MyAspect;
import com.xiajunzhuang.spring.service.IUserService;
import com.xiajunzhuang.spring.service.impl.UserServiceImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyWeaving {
    public static IUserService createUserService(){
        UserServiceImpl userService = new UserServiceImpl();
        MyAspect myAspect = new MyAspect();
        //3.cglib字节码增强
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                myAspect.before();
                Object invoke = method.invoke(userService, objects);
                myAspect.after();
                return invoke;
            }
        });
        return (IUserService) enhancer.create();
        //4.weaving织入
//        IUserService proxyUserService = (IUserService) Proxy.newProxyInstance(MyWeaving.class.getClassLoader(), userService.getClass().getInterfaces(), new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                myAspect.before();
//                Object invoke = method.invoke(userService, args);
//                myAspect.after();
//                return invoke;
//            }
//        });
//        return proxyUserService;
    }
}
