package com.database.pumpkin.mapper;

import com.database.pumpkin.domain.Criteria.SalesCriteria;
import com.database.pumpkin.domain.entity.SSales;
import com.database.pumpkin.mapper.base.MyMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author whl
 * @since 2021-11-23
 */
public interface SSalesMapper extends MyMapper<SSales> {

    void updateSales(SSales sSales);
    SSales findByDetailById(SSales sSales);
    List<SSales>  selectByParams(SalesCriteria salesCriteria);
}
