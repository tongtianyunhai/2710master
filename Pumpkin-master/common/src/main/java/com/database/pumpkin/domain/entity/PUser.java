package com.database.pumpkin.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class PUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    @TableField("userName")
    private String userName;

    @TableField("passWord")
    private String passWord;


    private Date loginTime;

    private Integer isvalid;

    private String updateBy;

    private Date updateTime;

    private String createBy;

    private Date createTime;

    private Integer menuId;

    private String pre1;

    private Integer star;

    private String email;

    private String nickName;

    private String gender;

}
