package org.example.ba02;

/**
 * @author dell
 */
public class Student {
    private String name;
    private int age;

    public Student(){
        name=null;
        age=0;
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        System.out.println("setName function");
        this.name = name;
    }
    public void setEmail(String name) {
        System.out.println("setName emile");

    }

    @Override
    public String toString() {
        return "student{"
                + "name='"
                + name + '\''
                + ", age="
                + age + '}';
    }
}
