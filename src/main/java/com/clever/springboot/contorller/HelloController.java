package com.clever.springboot.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChenWang
 * @className HelloController
 * @date 2020/11/14 15:07
 * @since JDK 1.8
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "This is a test";
    }
    //RESTAPI的方式
}
