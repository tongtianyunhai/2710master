package com.database.pumpkin.domain.Criteria;

import com.database.pumpkin.domain.base.BaseQueryCriteria;
import lombok.Data;

@Data
public class SalesCriteria  extends BaseQueryCriteria {
    private  String mName;
    private String mBn;
}
