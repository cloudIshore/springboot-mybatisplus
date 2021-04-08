package com.cloud.service.impl;

import com.cloud.entity.Department;
import com.cloud.mapper.DepartmentMapper;
import com.cloud.service.DepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    //查询所有
    @Override
    public List<Department> querryDepartment() {
        List<Department> departments =departmentMapper.selectList(null);
        return departments;
    }

    @Override
    public Department querryDepqrtmentById(Integer id) {

        return departmentMapper.selectById(id);
    }
}
