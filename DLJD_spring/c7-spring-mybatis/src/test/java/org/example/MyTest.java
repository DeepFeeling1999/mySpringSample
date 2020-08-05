package org.example;

import org.example.dao.StudentDao;
import org.example.domain.Student;
import org.example.service.StudentService;
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
            System.out.println("容器中的对象名+"+name+"|"+ac.getBean(name));
        }
    }

    @Test
    public void test02(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);

        StudentDao dao= (StudentDao) ac.getBean("studentDao");
        Student student=new Student("ttt","999@qq.com",99,999);

        int nums=dao.insetStudent(student);

    }

    @Test
    public void test03(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);

        StudentService service= (StudentService) ac.getBean("studentService");
        for(Student student:service.queryStudent())
            System.out.println(student);

    }
}
