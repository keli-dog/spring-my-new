package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BankServelt {
    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        System.out.println("保存数据");
        return "save success";
    }
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(Integer id) {
        System.out.println("删除数据");
        return "delete success";
        }


}
