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
public class BankController {
    @Autowired
    BankService bankService;

    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public String save(Bank bank) {
        /*AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.config");
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
}
