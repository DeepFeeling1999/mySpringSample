package org.example;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);

        String []names=ac.getBeanDefinitionNames();
        for(String name:names){
            System.out.println("容器中的对象名+"+name);
        }
    }
}
