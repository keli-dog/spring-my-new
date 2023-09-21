package com.test;

import com.itheima.service.BankService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankForAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext("com.config");
        BankService bankService = ctx.getBean(BankService.class);
        bankService.transfer("耿泽雨","刘天",500);
        bankService.in("李郑洋",500);
        ctx.close();
    }
}
