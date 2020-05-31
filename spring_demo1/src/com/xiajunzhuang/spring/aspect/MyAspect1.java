package com.xiajunzhuang.spring.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect1 implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("before");

        Object proceed = methodInvocation.proceed();
        System.out.println("after");
        return proceed;
    }
}
