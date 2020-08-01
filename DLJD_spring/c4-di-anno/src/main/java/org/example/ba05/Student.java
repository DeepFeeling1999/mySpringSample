package org.example.ba05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author dell
 */
@Component
public class Student {

    @Value("李四")
    private String name;
    private int age=333;

    /**
     * -@Resource: 来自jdk的注解，spring框架提供了支持
     *             也是自动注入，默认byName
     *             先byName，找不到再使用byType
     *
     * 使用@Resource(name="mySchool")
     * 是只使用byName
     *
     */
    @Resource
    private School school;

    public Student(){
        System.out.println(this.toString());
        System.out.println("执行构造方法");
        name="999";
        age=999;
        school=new School();
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        System.out.println("setName function");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", school=" + school + '}';
    }
}
