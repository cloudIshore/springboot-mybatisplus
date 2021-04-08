package com.cloud.entity;

import java.util.Date;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <p>
 * 
 * </p>
 *
 * @author cloud
 * @since 2021-04-01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee implements Serializable {


    @TableId(value = "id",type = IdType.INPUT)
    private Integer id;

    private String lastName;

    private String email;

    private Integer gender;

    private String department;

    private Date birth;


}
