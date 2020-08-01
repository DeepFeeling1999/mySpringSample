package org.example.ba03;

import org.springframework.beans.factory.annotation.Autowired;
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
     * 属性
     * （默认）required=true：（默认）表示引用类型赋值失败，程序报错，并终止
     *  required=false：引用类型如果赋值失败不报错，会是null
     *
     */
    @Autowired
    private School school;

    public Student(){
        System.out.println(this.toString());
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
