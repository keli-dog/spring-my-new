package com.itheima.controller;

import com.itheima.domain.Bank;
import com.itheima.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
//@ResponseBody
@RestController//代替以上俩个注解
@RequestMapping("/bank")
public class BankServelt {
    @Autowired
    BankService bankService;

    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public String save(Bank bank) {
        /*AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.itheima.config");
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println("Bean Name: " + beanName);
        }*/
        System.out.println("保存数据");
        bankService.save(bank);
        return "save success";
    }

    //@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Integer id) {
        bankService.delete(id);
        System.out.println("删除数据");
        return "delete success";
    }

    //@RequestMapping(method = RequestMethod.PUT)
    @PutMapping
    public String update(Bank bank) {
        System.out.println(bank);
        bankService.in(bank.getAccount(), bank.getMoney());
        System.out.println("修改数据");
        return "update success";
    }


    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public List<Bank> findAll() {
        return bankService.findAll();
    }

    //@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @GetMapping("/{id}")
    public Bank findById(@PathVariable Integer id) {
        // 根据ID查询数据
        return bankService.findById(id);
    }


    /*@RequestMapping("/test")
    @ResponseBody
    public String test(@RequestBody List<String> list) {//接收json格式的数据
        System.out.println(list);
        return "test success";
    }

    @RequestMapping("/date")
    @ResponseBody
    public String test(Date date,//日期类型参数接收
                       @DateTimeFormat(pattern = "yy-MM-dd") Date date1,
                       @DateTimeFormat(pattern = "yy-MM-dd HH:mm:ss")Date date2) {
        System.out.println(date+"\n"+date1+"\n"+date2);
        return "date success";
    }*/


}
