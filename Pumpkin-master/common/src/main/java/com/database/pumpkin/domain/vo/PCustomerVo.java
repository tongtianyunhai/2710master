package com.database.pumpkin.domain.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author：geliyang
 * @Version：1.0
 * @Date：2021/11/24-14:19
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PCustomerVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    private String userName;


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

   private String url;
}
