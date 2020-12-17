package com.clever.springboot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 使用@Value注解加载配置文件
 * @author ChenWang
 * @className SecondPerson
 * @date 2020/11/14 16:26
 * @since JDK 1.8
 */
@Data /*这个注释掉会报错，应该是反射需要set和get方法 */
@ToString
@Component
public class SecondPerson {
    /**
     * <bean class="Person">
     *      <property name="lastName" value="字面量/${key}从环境变量、配置文件中获取值/#{SpEL}"></property>
     *
     * </bean>
     */
    @Value("${person.last-name}")
    private String lastName;
    @Value("#{11*2}")
    private Integer age;
    @Value("true")
    private Boolean boss;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> list;
    private Dog dog;
}
