package com.itheima.config;


import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration//定义该类为配置类
@PropertySource(value = "classpath:jdbc.properties")//外部属性文件导入
@Import({JdbcConfig.class, MybatisConfig.class})//导入另外的配置类
@EnableAspectJAutoProxy// 开启切面方法通知
@EnableTransactionManagement//开启事务管理器
@ComponentScan("com.itheima")//包扫描路径
public class SpringConfig {
}
