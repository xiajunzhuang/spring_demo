package com.xiajunzhuang.spring.aspect;

public class MyAspect {
    public void before(){
        System.out.println("start transaction");
    }
    public void after(){
        System.out.println("end transaction");
    }
}
