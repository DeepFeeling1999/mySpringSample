package com.example.s6mybatis.controller;

import com.example.s6mybatis.mapper.UserMapper;
import com.example.s6mybatis.pojo.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserMapper userMapper;

    @Autowired
    public UserController(UserMapper userMapper){
        this.userMapper=userMapper;
    }

    @GetMapping("/uuu")
    public List<Good> queryGoodsList(){
        return userMapper.queryGoodsList();
    }


    @GetMapping("/addList")
    public void addL(){
        userMapper.addGood(new Good(666,"666",666,666));
    }

    @GetMapping("/delteList")
    public void deleteL(){
        userMapper.deleteGood(666);
    }
}
