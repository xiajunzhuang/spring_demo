package com.xiajunzhuang.spring.dao.Impl;

import com.xiajunzhuang.spring.dao.IBookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements IBookDao {
    @Override
    public void addBook() {
        System.out.println("添加书籍");
    }

    @Override
    public void deleteBook() {
        System.out.println("delete book success...");
    }
}
