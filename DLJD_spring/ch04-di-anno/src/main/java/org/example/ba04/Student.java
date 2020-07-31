package org.example.ba04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author dell
 */
@Component
public class Student {

    @Value("李四")
    private String name;
    private int age=333;

    /**
     * 默认使用byType
     * 此处是byName
     */
    @Autowired
    @Qualifier("sschool")
    private School school;

    public Student(){
        System.out.println("执行构造方法");
        System.out.println("888");
        name="999";
        age=999;
        school=new School();
        System.out.println(this.toString());
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
