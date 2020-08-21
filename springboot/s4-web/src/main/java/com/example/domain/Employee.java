package com.example.domain;

import com.example.dao.DepartmentDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 员工表
 * @author dell
 */
@Data
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String employeeName;
    private String email;

    /**
     * 0女，1男
     */
    private Integer gender;

    private Department department;
    private Date date;

    public Employee(Integer id, String employeeName, String email, Integer gender, Department department) {
        this.id = id;
        this.employeeName = employeeName;
        this.email = email;
        this.gender = gender;
        this.department = department;
        this.date=new Date();
    }

}
