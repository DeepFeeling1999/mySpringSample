package org.example.ba03;

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
        this.name = name;
    }
    public Student(String name,int age,School school){
        this.age=age;
        this.name=name;
        this.school=school;
    }
    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", school=" + school + '}';
    }
}
