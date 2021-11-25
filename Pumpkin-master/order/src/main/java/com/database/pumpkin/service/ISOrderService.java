package com.database.pumpkin.service;

import com.database.pumpkin.common.page.PageResult;
import com.database.pumpkin.domain.Criteria.SOrderCriteria;
import com.database.pumpkin.service.Base.BaseService;
import com.database.pumpkin.domain.entity.SOrder;

import java.util.List;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author whl
 * @since 2021-11-22
 */
public interface ISOrderService extends BaseService<SOrder> {
    PageResult<SOrder> selectByCustomerId(SOrderCriteria sOrderCriteria);
    SOrder selectByOrderId(Integer orderId);
}
