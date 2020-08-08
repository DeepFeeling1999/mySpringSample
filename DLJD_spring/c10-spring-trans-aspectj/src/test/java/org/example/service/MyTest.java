package org.example.service;

import org.example.service.impl.BuyGoodsServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void Test01(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);

        BuyGoodsService service= (BuyGoodsService) ac.getBean("buyGoodsService");
        System.out.println("service是代理"+service.getClass().getName());;
        service.buy(1001,1);
    }
}
