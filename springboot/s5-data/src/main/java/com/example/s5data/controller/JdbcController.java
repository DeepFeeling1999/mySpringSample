package com.example.s5data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * @author dell
 */
@RestController
public class JdbcController {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //@ResponseBody
    //@RequestMapping("/userList")

    @GetMapping("/userList")
    public List<Map<String, Object>> hello() {
        String sql = "select * from goods";

        List<Map<String, Object>> result = jdbcTemplate.queryForList(sql);
        System.out.println(result);
        return result;
    }

    @GetMapping("/addList")
    public void addL(){
        String sql="insert into goods(id,name,amount,price) values (666,'666',6,666)";
        jdbcTemplate.update(sql);
    }
}








