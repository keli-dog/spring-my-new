package com.itheima.service;

import com.itheima.domain.Bank;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BankService {
    void save(Bank bank);

    void delete(Integer id);

    void update(Bank bank);

    List<Bank> findAll();

    Bank findById(Integer id);


    //转账业务的接口
    void in(String account, int money);

    void out(String account, int money);

    @Transactional(rollbackFor = Exception.class)
    public boolean transfer(String plus, String cut, int money);
}
