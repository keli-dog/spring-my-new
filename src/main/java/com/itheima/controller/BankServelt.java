package com.itheima.controller;

import com.itheima.config.SpringConfig;
import com.itheima.domain.Bank;
import com.itheima.service.BankService;
import com.itheima.service.impl.BankServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/bank")
public class BankServelt {
    @RequestMapping("/save")
    @ResponseBody
    public String save(Bank bank) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
                String[] beanNames = context.getBeanDefinitionNames();
                for (String beanName : beanNames) {
                    System.out.println("Bean Name: " + beanName);
                }
        System.out.println(bank);
        System.out.println("保存数据"+bank.getAccount()+"的账户有"+bank.getMoney()+"元");
        /*BankService bankService = new BankServiceImpl();
        bankService.save(bank);*/
        return "save success";
    }
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(@RequestParam("id") Integer id) {
        System.out.println("删除数据");
        return "delete success";
        }
    @RequestMapping("/test")
    @ResponseBody
    public String test(@RequestBody List<String> list) {//接收json格式的数据
        System.out.println(list);
        return "test success";
    }

    @RequestMapping("/date")
    @ResponseBody
    public String test(Date date,
                       @DateTimeFormat(pattern = "yy-MM-dd") Date date1,
                       @DateTimeFormat(pattern = "yy-MM-dd HH:mm:ss")Date date2) {
        System.out.println(date+"\n"+date1+"\n"+date2);
        return "date success";
    }


}
