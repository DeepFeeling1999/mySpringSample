package org.example.ba01;

/**
 * @author dell
 */
public class Student {
    private String name;
    private int age;

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
