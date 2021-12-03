package com.database.pumpkin.mapper;

import com.database.pumpkin.common.page.PageResult;
import com.database.pumpkin.domain.Criteria.SOrderCriteria;
import com.database.pumpkin.domain.entity.SOrder;
import com.database.pumpkin.domain.vo.PriceVo;
import com.database.pumpkin.mapper.base.MyMapper;

import java.util.List;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author whl
 * @since 2021-11-22
 */
public interface SOrderMapper extends MyMapper<SOrder> {
    List<SOrder> selectByCustomerId(SOrderCriteria sOrderCriteria);
    SOrder selectByOrderId(Integer orderId);
    PriceVo getPrice(SOrder sOrder);

}
