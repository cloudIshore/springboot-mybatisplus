package com.cloud.service;

import com.cloud.entity.Department;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cloud
 * @since 2021-04-01
 */
public interface DepartmentService extends IService<Department> {
    //查询所有部门
    public List<Department> querryDepartment();

    //通过id获得部门
    public Department querryDepqrtmentById(Integer id);



}
