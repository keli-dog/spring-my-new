package com.itheima.dao;

import com.itheima.domain.Bank;
import org.apache.ibatis.annotations.*;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BankDao {

    @Insert("insert into bank(account, money) values(#{account}, #{money})")
    void save(Bank bank);

    @Delete("delete from bank where account= #{account}")
    void delete(Integer id);

    @Update("update bank set  money = money+#{money} where account= #{account}")
    void in(@Param("account") String name,@Param("money") int money);
    @Update("update bank set  money = money-#{money} where account= #{account}")
    void out(@Param("account") String name,@Param("money")int money);
    @Select("select * from bank")
    List<Bank> findAll();

    @Select("select * from bank where account= #{account}")
    Bank findById(Integer id);
    @Insert("insert into banktransferlog(info,time)values(#{info},now())")
    @Transactional(propagation = Propagation.REQUIRES_NEW)// 开启新事务不加入到事务管理员，不传播
    public void log(String msg);
}

