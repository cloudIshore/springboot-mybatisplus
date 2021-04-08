package com.cloud.controller;


import com.cloud.entity.Department;
import com.cloud.entity.Employee;
import com.cloud.service.DepartmentService;
import com.cloud.service.EmployeeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cloud
 * @since 2021-04-01
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;

    //查询所有员工 over
    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees = employeeService.getEmployees();
        model.addAttribute("employee",employees);
        return "emp/list";
    }


    //跳转添加员工页面 over
    @GetMapping("/emp")
    public String toAdd(Model model){
        //查出所有部门的信息
        Collection<Department> departments = departmentService.querryDepartment();
        model.addAttribute("departments",departments);
        return "emp/add";
    }

    //添加员工 over
    @PostMapping("/emp")
    public String addemp(Model model, Employee employee){
        employeeService.save(employee); //调用底层业务，保存员工
        return "redirect:/emps";

    }

    //跳转修改员工界面
    @GetMapping("/emp/{id}")
    public String toUpdateEmp(@PathVariable("id")Integer id, Model model){
        //查出原来数据
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("emp",employee);
        //查出所有部门的信息
        Collection<Department> departments = departmentService.querryDepartment();
        model.addAttribute("departments",departments);
        return "emp/update";
    }
    //修改员工
    @PostMapping("/updateEmp")
    public String updateEmp(Employee employee){
        //根据id保存信息（修改）
        employeeService.update(employee);
        return "redirect:/emps";
    }
    //删除用户 over
    @GetMapping("/delemp/{id}")
    public String deleteEmp(@PathVariable("id")int id){
        employeeService.delete(id);
        return "redirect:/emps";
    }

    //跳转主页
    @GetMapping("/index")
    public String index(){
        return "dashboard";
    }



}
