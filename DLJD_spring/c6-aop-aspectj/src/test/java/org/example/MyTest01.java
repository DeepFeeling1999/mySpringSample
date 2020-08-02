package org.example;

import org.example.ba01.SomeServiceImpl;
import org.example.ba01.someService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest01 {

    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        someService someService= (someService) ac.getBean("someServiceImpl");

        System.out.println(someService.getClass().getName());
        someService.doSome("名字",666);
    }

}
