package com.xiajunzhuang.spring.test;

import com.xiajunzhuang.spring.bean.User;
import com.xiajunzhuang.spring.service.IUserService;
import com.xiajunzhuang.spring.service.impl.UserServiceImpl;
import com.xiajunzhuang.spring.weav.MyWeaving;
import com.xiajunzhuang.spring.web.BookAction;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserTest {

    @Test
    public void test1(){
//        IUserService ius = new UserServiceImpl();
//        ius.addUser();
        //2.使用spring创建bean
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
        IUserService iUserService = (IUserService) con.getBean("userService");
        System.out.println(iUserService);

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Object userService = con.getBean("userService");
        System.out.println(userService);
    }

    @Test
    public void test2(){

        //1.类路径
        /*
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        IUserService userService = (IUserService) context.getBean("userService");
        userService.addUser();

         */


        //2.文件系统路径
        /*
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("F:\\Downloads\\spring_demo\\spring_demo1\\src\\beans.xml");
        IUserService userService = (IUserService) context.getBean("userService");
        userService.addUser();

         */
    }

    @Test
    public void test3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user4");
        System.out.println(user);
    }

    @Test
    public void test4(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        UserServiceImpl bean = (UserServiceImpl) context.getBean("userService");
//        bean.addUser();
//        BookAction bookAction = (BookAction) context.getBean("bookAction");
//        bookAction.addBook();
        BookAction bean = context.getBean(BookAction.class);
        bean.addBook();

    }
    @Test
    public void test5(){
        UserServiceImpl userService = new UserServiceImpl();
        userService.addUser();
        userService.deleteUser();
        System.out.println("----------------");
        IUserService userService1 = MyWeaving.createUserService();
        userService1.addUser();
        userService1.deleteUser();
    }
    @Test
    public void test6(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
        IUserService bean = (IUserService) context.getBean("serviceproxy");
        bean.addUser();
    }

    @Test
    public void test7(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
        IUserService bean = (IUserService) context.getBean("userservice");
        bean.addUser();
    }

}
