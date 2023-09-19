package com.itheima.dao;
import org.apache.ibatis.annotations.Delete;
import com.itheima.domain.Love;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;
public interface LoveDao {

    @Insert("insert into love(name,days,meettime,leavetime)values(#{name},#{days},'999','999')")
    void save(Love love);

    @Delete("delete from love where id = #{id} ")
    void delete(Integer id);

    @Update("update love set name = #{name} , days = #{days} where id = #{id} ")
    void update(Love love);

    @Select("select * from love")
    List<Love> findAll();

    @Select("select * from love where id = #{id} ")
    Love findById(Integer id);

}