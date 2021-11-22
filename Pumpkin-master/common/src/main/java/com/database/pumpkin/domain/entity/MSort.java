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
 * @since 2021-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MSort implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "sid", type = IdType.AUTO)
    private Integer sid;

    private String sortName;

    private Integer isparent;

    private Integer parentid;

    private String sortBn;

    private Integer isvalid;

    private String url;

    private String createBy;

    private Date createTime;

    private String preOne;

    private String preTwo;

    private String updateBy;

    private Date updateTime;


}
