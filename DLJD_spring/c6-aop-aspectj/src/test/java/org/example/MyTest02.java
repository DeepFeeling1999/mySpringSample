package org.example;

import org.example.ba02.someService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    @Test
    public void test02(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        someService someService= (someService) ac.getBean("someServiceImpl");

        System.out.println(someService.getClass().getName());
        Object res=someService.doSome("名字",666);
        System.out.println("通过代理修改返回值后 "+res);
    }
}
