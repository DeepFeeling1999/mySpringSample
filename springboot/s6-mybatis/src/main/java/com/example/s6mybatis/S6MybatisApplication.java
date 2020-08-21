package com.example.s6mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//在接口用@Mapper替代了在主类用
//@MapperScan(basePackages = {"com.example.s6mybatis.mapper"})
public class S6MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(S6MybatisApplication.class, args);
    }

}
