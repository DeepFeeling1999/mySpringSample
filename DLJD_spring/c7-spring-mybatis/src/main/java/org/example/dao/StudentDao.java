package org.example.dao;

import org.example.domain.Student;

import java.util.List;

public interface StudentDao {
    int insetStudent(Student student);
    List<Student> selectStudents();
}
