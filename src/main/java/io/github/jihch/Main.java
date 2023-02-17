package io.github.jihch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
@MapperScan("io.github.jihch.mapper")
public class Main {

    public static void main(String[] args) {
//        SpringApplication.run(Main.class, args);

        //1、返回 IOC 容器
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

        //2、查看容器里面的组件
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.sort(beanDefinitionNames);
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }

    }
}