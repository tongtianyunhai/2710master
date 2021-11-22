package com.database.pumpkin.domain.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author：geliyang
 * @Version：1.0
 * @Date：2021/11/19-20:06
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MMerchandiseVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String mName;

    private Integer mSort;

    private String sortName;

    private String brandName;

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

    private String merichandisePicture;

    private String sortPicture;

}
