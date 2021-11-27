package com.database.pumpkin.domain.criteria;

import com.database.pumpkin.domain.criteria.base.BaseQueryCriteria;
import io.swagger.models.auth.In;
import lombok.Data;

/**
 * @Author：geliyang
 * @Version：1.0
 * @Date：2021/11/18-21:16
 * @Since:jdk1.8
 * @Description:TODO
 */
@Data
public class MMerchandiseCriteria extends BaseQueryCriteria {
    private  String mName;
    private Integer mSort;
    private String mBn;
}
