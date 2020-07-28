package org.example.ba02;

/**
 * @author dell
 */
public class Student {
    private String name;
    private int age;

    private School school;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        System.out.println("setName function");
        this.name = name;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", school=" + school + '}';
    }
}
