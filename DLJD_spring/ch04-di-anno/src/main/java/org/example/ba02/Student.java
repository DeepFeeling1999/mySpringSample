package org.example.ba02;

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

    public Student(){
        System.out.println("666");
    }

    /*public void setAnge(Integer ange) {
        this.ange = ange;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", ange=" + ange + '}';
    }
}
