package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @Configuration: 此文件 为配置文件
 * @EnableAutoConfiguration：使用自动配置
 * @ComponentScan:可扫描的
 * @SpringBootApplication:
 * Application: 启动管理器
 *
 *
 */

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.example.dao")
//@ComponentScan("com.example")
public  class Application implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings){
        System.out.println("Spring boot Started!");
    }
}