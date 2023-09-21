package com.itheima.controller;

import com.itheima.controller.ResultController.CodeStatus;
import com.itheima.controller.ResultController.Result;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {// 新增
        System.out.println("book save ==> " + book);
        boolean flag = bookService.add(book);
        Integer code=flag ? CodeStatus.SAVE_OK.getCode()
                : CodeStatus.SAVE_ERROR.getCode();
        return new Result(flag,code);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable int id) {// 删除
        System.out.println("id==>" + id);
        boolean flag=bookService.delete(id);
        System.out.println(flag+"controller");
        Integer code=flag ? CodeStatus.DELETE_OK.getCode()
                : CodeStatus.DELETE_ERROR.getCode();
        return new Result(flag,code);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {// 更新
        System.out.println("book update ==> " + book);
        boolean flag=bookService.update(book);
        Integer code=flag ? CodeStatus.UPDATE_OK.getCode()
                          : CodeStatus.UPDATE_ERROR.getCode();
        return new Result(flag,code);
    }

    @GetMapping("/{id}")
    public Result get(@PathVariable int id) {// 根据ID查询数据
        System.out.println("book getById is running ...");
        Book book= bookService.findById(id);
        Integer code=book!=null? CodeStatus.GET_OK.getCode()
                               : CodeStatus.GET_ERROR.getCode();
        String msg= book != null ? "": "no book is found";
        return new Result(book,code,msg);
    }

    @GetMapping
    public Result getAll() {// 获取所有数据
        System.out.println("book getAll is running ...");
        List<Book> bookList = bookService.findAll();
        Integer code=bookList!=null? CodeStatus.GET_OK.getCode()
                                   : CodeStatus.GET_ERROR.getCode();
        String msg= bookList!= null ? "": "no books is found";
        return new Result(bookList,code,msg);
    }

}














