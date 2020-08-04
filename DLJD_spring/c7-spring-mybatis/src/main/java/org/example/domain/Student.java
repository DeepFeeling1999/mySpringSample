package org.example.domain;

/**
 * @author dell
 */
public class Student {
    private String name;
    private String email;
    private Integer id;
    private Integer age;
    public Student() {
    }

    public Student(String name, String email, Integer id, Integer age) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
