package org.example;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    /**
     * spring 默认创建对象的时间，是在创建spring容器时
     * 会创建容器时，创建配置文件中的所有的对象
     * 默认调用无参构造方法
     */
    @Test
    public void test02(){
        //使用spring容器创建对象
        //1指定spring配置文件的名称
        String myConfig="beans.xml";
        //2创建表示spring容器的对象，ApplicationContext
        //ApplicationContext表示spring容器，通过容器获取对象
        //表示从类
        ApplicationContext ac=new ClassPathXmlApplicationContext(myConfig);

        //从容器中获取某个对象，要调用对象的方法
        //getBean("配置中的bean的id值")
        //someService service=(someService) ac.getBean("b1");

        //使用spring创建好的对象
        //service.doSome();

    }
}
