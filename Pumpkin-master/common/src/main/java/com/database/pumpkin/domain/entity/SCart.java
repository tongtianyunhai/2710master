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

    private LocalDateTime datetime;

    private Integer merchandiseId;

    private Integer quantity;

    private Double currentPrice;

    private String createBy;

    private LocalDateTime createTime;

    private String preOne;

    private String preTwo;

    private String updateBy;

    private LocalDateTime updateTime;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }
}
