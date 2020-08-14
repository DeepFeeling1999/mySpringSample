package com.example.controller;

import com.example.dao.EmployeeDao;
import com.example.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class EmployeeController {


    private final EmployeeDao employeeDao;
    @Autowired
    public EmployeeController(EmployeeDao employeeDao){
        this.employeeDao=employeeDao;
    }

    /**
     * 需要返回给前端，所以添加model
     */
    @RequestMapping("/employees")
    public String list(Model model){
        Collection<Employee> employees= employeeDao.getEmployees();
        model.addAttribute("myEmployees",employees);
        return "list.html";
    }
}
