package com.cloud.controller;


import com.cloud.entity.Department;
import com.cloud.mapper.DepartmentMapper;
import com.cloud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cloud
 * @since 2021-04-01
 */
@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    //查询所有
    @GetMapping("/querry")
    public List<Department> querryDepartment(){

        return departmentService.querryDepartment();
    }

    //查询一个
    @GetMapping("/querry/{id}")
    public Department querryDepqrtmentById(@PathVariable("id")Integer id){


        return departmentService.querryDepqrtmentById(id);
    }



}
