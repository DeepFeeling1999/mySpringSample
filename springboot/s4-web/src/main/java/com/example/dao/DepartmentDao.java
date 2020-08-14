package com.example.dao;

import com.example.domain.Department;
import com.example.domain.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author dell
 */
@Repository
public class DepartmentDao {
    private static Map<Integer, Department> departments=null;

    static{
        departments=new HashMap<>();

        departments.put(1,new Department(1,"1部门"));
        departments.put(2,new Department(2,"2部门"));
        departments.put(3,new Department(3,"3部门"));
        departments.put(4,new Department(4,"4部门"));
        departments.put(5,new Department(5,"5部门"));
        departments.put(6,new Department(6,"6部门"));
    }

    /**
     * 获取所有部门信息
     */
    public Collection<Department> getDepartments(){
        return departments.values();
    }

    /**
     * 通过id获得部门信息
     */
    public Department getDepartment(Integer id){
        return departments.get(id);
    }

}
