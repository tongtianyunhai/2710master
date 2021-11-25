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
public class SSales implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer merchandiseId;

    private Double price;

    private Double discount;

    private String description;

    private String createBy;

    private LocalDateTime createTime;

    private String preOne;

    private String preTwo;

    private String updateBy;

    private LocalDateTime updateTime;


}
