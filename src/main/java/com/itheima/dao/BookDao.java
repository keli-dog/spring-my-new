package com.itheima.dao;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BookDao {
    @Insert("insert into tbl_book(type,name,description)values(#{type},#{name},#{description})")
    public int insert(Book book);

    @Delete("delete from tbl_book where id = #{id} ")
    public int delete(int id);

    @Update("update tbl_book set  description = #{description} where name=#{name}")
    public int update(Book book);

    @Select("select * from tbl_book where id=#{id}")
    public Book findById(int id);

    @Select("select * from tbl_book where name=#{name}")
    public Book findByName(String name);

    @Select("select * from tbl_book")
    public List<Book> findAll();
}
