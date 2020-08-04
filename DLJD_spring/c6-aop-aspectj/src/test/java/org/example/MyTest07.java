package org.example;

import org.example.ba07.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest07 {
    @Test
    public void test07(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        SomeServiceImpl someService= (SomeServiceImpl) ac.getBean("someServiceImpl");

        System.out.println(someService.getClass().getName());

        someService.doThird();

    }
}
