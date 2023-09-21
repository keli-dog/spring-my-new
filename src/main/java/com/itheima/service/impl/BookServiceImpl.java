package com.itheima.service.impl;

import com.itheima.controller.ExceptionController.SystemException;
import com.itheima.controller.ResultController.CodeStatus;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookDao bookDao;

    @Override
    public boolean add(Book book) {
        return bookDao.insert(book)>0;
    }

    @Override
    public boolean delete(Integer id) {return bookDao.delete(id)>0;}

    @Override
    public boolean update(Book book) {
        return  bookDao.update(book)>0;
    }

    @Override
    public Book findById(Integer id) {
//        if (id == 1) {测试异常处理
//            throw new SystemException(CodeStatus.SYS_ERROR.getCode(),"系统异常，请稍后再试！");
//        }
//        else if(id<9) {
//            throw new SystemException(CodeStatus.SYS_RUNTIME_ERROR.getCode(),"找不到该id的数据");
//        }
        return bookDao.findById(id);
    }

    @Override
    public Book findByName(String name) {
        return bookDao.findByName(name);
    }

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }
}
