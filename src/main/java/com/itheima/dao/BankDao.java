package com.itheima.dao;

import com.itheima.domain.Bank;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

public interface BankDao {
    //插入账户
    @Insert("insert into bank(account, money) values(#{account}, #{money})")
    void save(Bank bank);

    //通过id删除
    @Delete("delete from bank where id= #{id}")
    void delete(Integer id);

    //修改用户
    @Update("update bank set money=#{money} where account= #{account}")
    void update (Bank bank);

    //查询所有
    @Select("select * from bank")
    List<Bank> findAll();

    //通过id查询
    @Select("select * from bank where id= #{id}")
    Bank findById(Integer id);


    //以下是转账业务以及日志记录
    @Update("update bank set  money = money+#{money} where account= #{account}")
    void in(@Param("account") String name, @Param("money") int money);

    @Update("update bank set  money = money-#{money} where account= #{account}")
    void out(@Param("account") String name, @Param("money") int money);

    @Insert("insert into banktransferlog(info,time)values(#{info},now())")
    @Transactional(propagation = Propagation.REQUIRES_NEW)// 开启新事务不加入到事务管理员，不传播
    public void log(String msg);


}

