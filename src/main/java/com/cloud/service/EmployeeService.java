package com.cloud.service;

import com.cloud.entity.Employee;
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
public interface EmployeeService {
    //获取所有员工信息
    List<Employee> getEmployees();

    //新增一个员工
    void save(Employee employee);

    //通过id获得员工信息
    Employee getEmployeeById(Integer id);

    //通过id删除一个员工
    void delete(Integer id);

//    void update(Integer id);

    void update(Employee employee);

}
