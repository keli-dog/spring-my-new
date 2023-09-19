package com.itheima.service.impl;

import com.itheima.dao.BankDao;
import com.itheima.domain.Bank;
import com.itheima.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService {
    @Autowired
    BankDao bankDao;


    @Override
    public void save(Bank bank) {
        bankDao.save(bank);
    }

    @Override
    public void delete(Integer id) {
        bankDao.delete(id);
    }

    @Override
    public void in(String account, int money) {
        bankDao.in(account, money);
    }

    @Override
    public void out(String account, int money) {
        bankDao.out(account, money);
    }

    @Override
    public List<Bank> findAll() {
        return bankDao.findAll();
    }

    @Override
    public Bank findById(Integer id) {
        return bankDao.findById(id);
    }
    //该事务默认将三个事务都加入，不符合要求
    /*@Override
    public boolean transfer(String plus,String cut,int money) {
        try {
            bankDao.out(cut,money);
            int a = 1 / 0;
            bankDao.in(plus,money);
        }finally {
            bankDao.log(cut+"给"+plus+"转账"+money+"元");
        }
        return false;
    }*/
    @Override
    public boolean transfer(String plus,String cut,int money) {
        try {
            bankDao.out(cut,money);
            bankDao.in(plus,money);
        }finally {
            bankDao.log(cut+"给"+plus+"转账"+money+"元");
        }
        return false;
    }
}
