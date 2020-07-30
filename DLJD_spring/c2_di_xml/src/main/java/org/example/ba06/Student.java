package org.example.ba06;

/**
 * @author dell
 */
public class Student {
    private String name;
    private int age;

    private School mySchool;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMySchool(School mySchool) {
        this.mySchool = mySchool;
    }

    public School getMySchool() {
        return mySchool;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", mySchool=" + mySchool + '}';
    }
}
