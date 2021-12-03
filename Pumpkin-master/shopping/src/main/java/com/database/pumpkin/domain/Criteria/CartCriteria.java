package com.database.pumpkin.domain.Criteria;

import com.database.pumpkin.domain.base.BaseQueryCriteria;
import lombok.Data;

@Data
public class CartCriteria extends BaseQueryCriteria {
    private String customerId;
}
