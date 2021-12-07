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

    @TableField("uid")
    private String uid;
    @TableField(value="passWord")
    private String passWord;

    private Date loginTime;

    private Integer isvaild;

    private String updateBy;

    private Date updateTime;

    private String createBy;

    private Date createTime;

    private Integer menuId;

    private String preOne;

    private String preTwo;

    private Integer star;

    private String email;

    private String nickName;

    private Integer roleid;
}
