package org.example.impl;

import org.example.someService;

public class someServiceImpl implements someService {
    public someServiceImpl(){
        System.out.println("构造方法");
    }
    @Override
    public void doSome() {
        System.out.println("执行了");
    }
}
