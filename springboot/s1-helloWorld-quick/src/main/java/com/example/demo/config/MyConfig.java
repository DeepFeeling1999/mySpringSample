package com.example.demo.config;

import com.example.demo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    /**
     * 将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
     */
    @Bean
    public HelloService helloService() {
        System.out.println("添加组件 Hello");
        return new HelloService();
    }
}
