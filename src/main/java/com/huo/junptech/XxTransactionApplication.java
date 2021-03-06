package com.huo.junptech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan(basePackages = "com.huo.junptech.mapper")
@EnableTransactionManagement
public class XxTransactionApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(XxTransactionApplication.class, args);
    }

}
