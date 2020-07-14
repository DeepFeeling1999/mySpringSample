package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author DeepFeeling1999
 *
 * 此注解表明是一个SpringBoot应用。
 * 融合了@SpringBootConfiguration--声明为配置类
 * -@EnableAutoConfiguration--启动自动配置
 * -@ComponentScan--启动组件扫描
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}