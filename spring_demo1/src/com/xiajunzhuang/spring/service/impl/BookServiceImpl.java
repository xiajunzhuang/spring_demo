package com.xiajunzhuang.spring.service.impl;

import com.xiajunzhuang.spring.dao.IBookDao;
import com.xiajunzhuang.spring.dao.Impl.BookDaoImpl;
import com.xiajunzhuang.spring.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private IBookDao bookDao;


    @Override
    public void addBook() {
        bookDao.addBook();
    }

    @Override
    public void deleteBook() {
        bookDao.deleteBook();
    }
}
