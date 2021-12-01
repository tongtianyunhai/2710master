package com.database.pumpkin.domain.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author：geliyang
 * @Version：1.0
 * @Date：2021/11/30-19:04
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class RankInfoVo {
    private String number;

    private String sumprice;

    private String mName;

    private String mSort;

    private String sortName;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private String brandName;

}
