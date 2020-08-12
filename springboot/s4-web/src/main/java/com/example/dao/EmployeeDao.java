package com.example.dao;

import com.example.domain.Department;
import com.example.domain.Employee;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;


/**
 * @author dell
 */
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;

    static {
        employees = new HashMap<>();

        employees.put(1, new Employee(1, "a 啊", "111@qq.com", 0, new Department(1, "1部门")));
        employees.put(2, new Employee(2, "b 吧", "222@qq.com", 1, new Department(2, "2部门")));
        employees.put(3, new Employee(3, "c 蠢", "333@qq.com", 1, new Department(3, "3部门")));
    }


    private static Integer initId = 3;

    /**
     * 增加员工，id主键自增
     */
    public boolean addEmployee(Employee employee) {
        employee.setId(initId++);
        employees.put(initId, employee);
        return true;
    }

    /**
     * 删除员工
     */
    public void delete(Integer id) {
        employees.remove(id);
    }

    /**
     * 获取所有员工信息
     */
    public Collection<Employee> getEmployees() {
        return employees.values();
    }

    /**
     * 通过id获得员工信息
     */
    public Employee getEmployee(Integer id) {
        return employees.get(id);
    }
}
