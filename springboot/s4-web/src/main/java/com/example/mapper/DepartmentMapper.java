package com.example.mapper;

import com.example.domain.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DepartmentMapper {

    List<Department> getDepartments();
    Department getDepartment(Integer id);
}
