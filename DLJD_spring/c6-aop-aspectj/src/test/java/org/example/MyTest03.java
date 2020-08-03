package org.example;

import org.example.ba03.someService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest03 {
    @Test
    public void test03(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        someService someService= (someService) ac.getBean("someServiceImpl");

        System.out.println(someService.getClass().getName());

        Object res=someService.doFirst("名字",666);
        //相当于直接替换为代理调用---public Object myAround(ProceedingJoinPoint p)
        //所以Around通知可以修改结果

        System.out.println("通过代理修改返回值后 "+res);
    }
}
