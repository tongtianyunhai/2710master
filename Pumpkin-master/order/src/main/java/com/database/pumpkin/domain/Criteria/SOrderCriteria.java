package com.database.pumpkin.domain.Criteria;

import com.database.pumpkin.domain.base.BaseQueryCriteria;
import lombok.Data;

@Data
public class SOrderCriteria extends BaseQueryCriteria {
    public String customerId;
    public Integer orderId;
}
