package com.xiajunzhuang.spring.web;

import com.xiajunzhuang.spring.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookAction {
    @Autowired
    private IBookService bookService;

    public String addBook(){
        bookService.addBook();
        return "success";
    }
}
