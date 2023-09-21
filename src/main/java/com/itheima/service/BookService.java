package com.itheima.service;

import com.itheima.domain.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {
    public boolean add(Book book);
    public boolean delete(Integer id);
    public boolean update(Book book);
    public Book findById(Integer id);
    public Book findByName(String name);
    public List<Book> findAll();
}
