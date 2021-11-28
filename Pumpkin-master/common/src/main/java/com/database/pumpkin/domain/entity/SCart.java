package com.database.pumpkin.domain.entity;

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
 * @since 2021-11-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SCart implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer customerId;

    private Integer quantity;

    private Double currentPrice;

    private String createBy;

    private LocalDateTime createTime;

    private String mName;

    private String mBn;

    private String updateBy;

    private LocalDateTime updateTime;


}
