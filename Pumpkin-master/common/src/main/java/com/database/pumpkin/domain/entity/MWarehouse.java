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
 * @since 2021-10-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MWarehouse implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "sid", type = IdType.AUTO)
    private Integer sid;

    private String wareName;

    private String wareColor;

    private String wareSize;

    private String wareBn;

    private Integer wareAmount;

    private Date createTime;

    private String createBy;

    private String updateBy;

    private Date updateTime;

    private String pre1;

    private String pre2;


}
