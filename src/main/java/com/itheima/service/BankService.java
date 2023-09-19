package com.itheima.service;

import com.itheima.domain.Bank;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BankService {
    void save(Bank bank);
    void delete(Integer id);
    void in(String account, int money);
    void out(String account, int money);
    List<Bank> findAll();
    Bank findById(Integer id);
    @Transactional(rollbackFor = Exception.class)
    public boolean transfer(String plus, String cut, int money);
}
