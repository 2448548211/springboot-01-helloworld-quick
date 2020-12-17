package com.clever.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 *
 * * @ConfigurationProperties 告诉SpringBoot将本报类中的而所有属性和配置文件
 * * 相关的配置进行绑定
 * * prefix="person",配置文件中的哪个下面的所有属性进行一一映射
 *      只有这个组件是容器中中的组件，才能使用容器提供的ConfigurationProperties功能
 * @author ChenWang
 * @className Person
 * @date 2020/11/14 15:46
 * @since JDK 1.8
 */
@Data
@ToString
//@AllArgsConstructor 开了全参就没有默认的无参，这样反射生成不了Person类
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String lastName;
    private Integer age;
    private Boolean boss;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> list;
    private Dog dog;
}
