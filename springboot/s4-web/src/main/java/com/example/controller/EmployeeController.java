package com.example.controller;

import com.example.dao.DepartmentDao;
import com.example.dao.EmployeeDao;
import com.example.domain.Department;
import com.example.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.PriorityQueue;

/**
 * @author dell
 */
@Controller
public class EmployeeController {

    private final EmployeeDao employeeDao;
    private final DepartmentDao departmentDao;
    @Autowired
    public EmployeeController(EmployeeDao employeeDao,DepartmentDao departmentDao){
        this.employeeDao=employeeDao;
        this.departmentDao=departmentDao;
    }

    /**
     * 需要返回给前端，所以添加model
     */
    @RequestMapping("/urlEmployees")
    public String list(Model model){
        Collection<Employee> employees= employeeDao.getEmployees();
        model.addAttribute("myEmployees",employees);
        return "list";
    }

    @GetMapping("/addEmployee")
    public String toAdd(Model model){
        //查询所有部门信息
        Collection<Department> departments=departmentDao.getDepartments();
        model.addAttribute("myDepartments",departments);
        return "employee/add";
    }

    /**
     * 增加员工
     * @param employee 需要增加的员工
     * @return 跳转到信息页
     */
    @PostMapping("/postEmployee")
    public String postAdd(Employee employee){
        System.out.println(employee);

        //调用
        employeeDao.addEmployee(employee);
        return "redirect:/urlEmployees";
    }


    /**
     * 跳转到员工信息修改页面
     */
    @GetMapping("/EditEmployee/{id}")
    public String updateEmployee(@PathVariable("id")Integer id, Model model){
        Employee employee=employeeDao.getEmployee(id);
        model.addAttribute("aEmployee",employee);

        Collection<Department> departments=departmentDao.getDepartments();
        model.addAttribute("aDepartments",departments);

        return "employee/update";
    }

    @PostMapping("/updateEmployee")
    public String updateEmployee(Employee employee) throws CloneNotSupportedException {
        employeeDao.updateEmployee(employee);
        return "redirect:/urlEmployees";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") int id) {
        employeeDao.delete(id);
        return "redirect:/urlEmployees";
    }
}
