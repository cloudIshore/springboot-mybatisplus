package com.cloud.service.impl;

import com.cloud.entity.Employee;
import com.cloud.mapper.EmployeeMapper;
import com.cloud.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cloud
 * @since 2021-04-01
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    //查询所有
    @Override
    public List<Employee> getEmployees() {
        List<Employee> employees = employeeMapper.selectList(null);
        return employees;
    }

    //添加一个
    @Override
    public void save(Employee employee) {
       employeeMapper.insert(employee);
    }

    //通过id查询
    @Override
    public Employee getEmployeeById(Integer id) {
        Employee employee = employeeMapper.selectById(id);
        return employee;
    }
    //通过id删除
    @Override
    public void delete(Integer id) {
        employeeMapper.deleteById(id);
    }



    //通过id修改
    @Override
    public void update(Employee employee) {
        employeeMapper.updateById(employee);
    }
}
