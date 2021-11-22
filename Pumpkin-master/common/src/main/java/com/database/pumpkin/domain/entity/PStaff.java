package com.database.pumpkin.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author whl
 * @since 2021-10-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PStaff implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "sid", type = IdType.AUTO)
    private Integer sid;

    private Integer roleId;

    private String name;

    private String department;

    private String address;

    private String city;

    private String state;

    private Integer zipcode;

    private Integer job;


}
