package org.example.ba03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * @author dell
 */
@Component
public class Student {

    /**
     * -@Value简单属性赋值
     * 一般放在值上，也可以放在set方法上
     */
    @Value("李四")
    private String name ;
    @Value("666")
    private Integer ange;

    /**
     *
     */

    private final School school;


    public Student(School school){
        System.out.println("666");
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", ange=" + ange + '}';
    }
}
