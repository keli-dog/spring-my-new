package com.config.SpringMvcConfigs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.Filter;

@Configuration
@ComponentScan({"com.itheima.controller", "com.config.SpringMvcConfigs"})
@EnableWebMvc//开启自动转换json数据支持
public class SpringMvcConfig {
}
