package com.example.mapper;

import com.example.domain.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {
    List<Employee> getEmployees();
    void addEmployee(Employee employee);
    void delete(Integer id);
    Employee getEmployee(Integer id);
    void updateEmployee(Employee employee);
}
