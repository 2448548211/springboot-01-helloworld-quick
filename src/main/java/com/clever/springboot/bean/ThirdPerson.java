package com.clever.springboot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 使用@Properties加载其他的配置文件
 * @author ChenWang
 * @className ThirdPerson
 * @date 2020/11/14 16:47
 * @since JDK 1.8
 */
@PropertySource(value={"classpath:person.properties"})
@ConfigurationProperties(prefix = "theperson")
@Data
@ToString
@Component
public class ThirdPerson {
    private String lastName;
    private Integer age;
    private Boolean boss;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> list;
    private Dog dog;
}
