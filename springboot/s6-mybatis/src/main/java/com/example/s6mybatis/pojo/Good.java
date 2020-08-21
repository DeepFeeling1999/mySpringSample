package com.example.s6mybatis.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Good {
    private int id;
    private String name;
    private int amount;
    private double price;

}
