package com.database.pumpkin.domain.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.database.pumpkin.domain.entity.MSort;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @Author：geliyang
 * @Version：1.0
 * @Date：2021/11/1-17:47
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MSortVo {
    @TableId(value = "sid", type = IdType.AUTO)

    private Integer typeid;

    private String typename;


    private List<MBrandVo> children;





}

