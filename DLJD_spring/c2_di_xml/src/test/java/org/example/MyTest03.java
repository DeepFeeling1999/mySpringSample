package org.example;


import org.example.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.Date;

public class MyTest03 {
    /**
     * spring 默认创建对象的时间，是在创建spring容器时
     * 会创建容器时，创建配置文件中的所有的对象
     * 默认调用无参构造方法
     */


    /**
     * 创建测试方法，必须是public，没有返回值
     */
    @Test
    public void test01() {
        //使用spring容器创建对象
        //1指定spring配置文件的名称
        String myConfig = "ba01/applicationContext.xml";
        //2创建表示spring容器的对象，ApplicationContext
        //ApplicationContext表示spring容器，通过容器获取对象
        //表示从类
        ApplicationContext ac = new ClassPathXmlApplicationContext(myConfig);

        //从容器中获取某个对象，要调用对象的方法
        Student student = (Student) ac.getBean("myStudent");
        System.out.println(student);


        Date myDate= (Date) ac.getBean("myDate");
        System.out.println(myDate);

        //使用spring创建好的对象
        //service.doSome();

    }

    @Test
    public void test02(){
        System.out.println("02");
        String config="ba03/applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);

        Student student= (Student) ac.getBean("Student2");

        System.out.println(student);

        File myFile= (File) ac.getBean("myFile");
        System.out.println(myFile.getName());
    }

}

