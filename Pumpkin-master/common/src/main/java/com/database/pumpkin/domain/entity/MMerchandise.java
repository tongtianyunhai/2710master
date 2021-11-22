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
public class MMerchandise implements Serializable {

    private static final long serialVersionUID = 1L;

    private String mName;

    private Integer mSort;

    private Double mPrice;

    private Integer mIsvaild;

    private String mBn;

    private String mColor;

    private String mSize;

    private Date createTime;

    private String createBy;

    private Date updateTime;

    private String updateBy;

    private String preOne;

    private String preTwo;

}
