package com.database.pumpkin.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;


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
public class PCustomer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cid", type = IdType.AUTO)
    private Integer cid;

    private Integer roleId;

    private Date birthday;

    private Integer userId;

    private String country;

    private Double balance;

    private String city;

    private Integer zipcode;

    private String state;

    private String street;

    private Integer gender;

}
