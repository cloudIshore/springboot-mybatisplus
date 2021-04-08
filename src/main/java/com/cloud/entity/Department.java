package com.cloud.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author cloud
 * @since 2021-04-01
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Department implements Serializable {

    private Integer id;

    private String departmentName;


}
