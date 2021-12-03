package com.database.pumpkin.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author whl
 * @since 2021-11-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    private String orderId;

    private String customerId;

    private LocalDateTime datetime;

    private String quantity;

    private Double price;

    private String shipping;

    private String remark;

    private String mName;

    private String mBn;

    private String updateBy;

    private LocalDateTime updateTime;


}
