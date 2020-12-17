package com.clever.springboot.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ChenWang
 * @className MyConfig
 * @date 2020/11/14 17:37
 * @since JDK 1.8
 */
@Configuration
public class MyConfig {

    @Bean
    public HelloService helloService(){
        System.out.println("HelloService注册进入Spring容器");
        return new HelloService();
    }
}
