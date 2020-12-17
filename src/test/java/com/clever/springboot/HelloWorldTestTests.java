package com.clever.springboot;

import com.clever.springboot.bean.Person;
import com.clever.springboot.bean.SecondPerson;
import com.clever.springboot.bean.ThirdPerson;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

/**
 * spring boot 的单元测试
 */

@SpringBootTest
@Slf4j
class HelloWorldTestTests {

    @Resource
    Person person;
    @Resource
    SecondPerson secondPerson;
    @Resource
    ThirdPerson thirdPerson;
    @Resource
    ApplicationContext ioc;
    @Test
    public void testHandler(){
        boolean flag = ioc.containsBean("helloService");
        //级别由高到低
        log.error("aaa");
        log.warn("aaa");
        log.info("aaa");
        log.debug("aaa");
        log.trace("aaa");
        System.out.println(flag);
    }
    @Test
    void contextLoads() {
//        System.out.println(person);
        System.out.println(secondPerson);
        System.out.println(thirdPerson);
    }
}
