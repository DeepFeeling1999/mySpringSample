package org.example.impl;

import org.example.someService;

/**
 * @author dell
 */
public class SomeServiceImpl implements someService {
    public SomeServiceImpl(){
        System.out.println("构造方法");
    }
    @Override
    public void doSome() {
        System.out.println("执行了");
    }
}
