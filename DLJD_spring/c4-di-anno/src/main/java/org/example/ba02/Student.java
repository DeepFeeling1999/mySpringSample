package org.example.ba02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * @author dell
 */
@Component
public class Student {

    @Value("${myname}")
    private String name ;

    @Value("${myage}")
    private Integer age;

    public Student(){
        System.out.println("666");
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", ange=" + age + '}';
    }
}
