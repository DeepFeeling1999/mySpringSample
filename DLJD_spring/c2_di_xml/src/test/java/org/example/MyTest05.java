package org.example;


import org.example.ba05.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest05 {
    /**
     * spring 默认创建对象的时间，是在创建spring容器时
     * 会创建容器时，创建配置文件中的所有的对象
     * 默认调用无参构造方法
     */
    @Test
    public void test01(){
        String config="ba05/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);

        Student student= (Student) ac.getBean("myStudent");
        System.out.println(student);
    }

}

