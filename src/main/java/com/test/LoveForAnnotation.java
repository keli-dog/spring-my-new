package com.test;

import com.itheima.domain.Love;
import com.itheima.service.LoveService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class LoveForAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext("com.config");
        //Mybatis连接数据库
        LoveService loveService = ctx.getBean(LoveService.class);
        // accountService.save(new Love("  genzeyu    ", 199));
        List<Love> all = loveService.findAll();
        System.out.println(all);
        Love act = loveService.findById(3);
        System.out.println(act);
        ctx.close();
    }
}
