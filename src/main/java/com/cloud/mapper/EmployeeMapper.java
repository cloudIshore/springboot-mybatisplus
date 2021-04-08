package com.cloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cloud
 * @since 2021-04-01
 */
@Mapper
@Repository
public interface EmployeeMapper extends BaseMapper<Employee> {

}
