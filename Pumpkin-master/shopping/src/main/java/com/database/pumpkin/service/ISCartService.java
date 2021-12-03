package com.database.pumpkin.service;

import com.database.pumpkin.common.page.PageResult;
import com.database.pumpkin.domain.Criteria.CartCriteria;
import com.database.pumpkin.domain.Criteria.SalesCriteria;
import com.database.pumpkin.domain.entity.SCart;
import com.database.pumpkin.domain.entity.SSales;
import com.database.pumpkin.service.Base.BaseService;

import java.util.List;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author whl
 * @since 2021-11-23
 */
public interface ISCartService  extends BaseService<SCart> {
    void deleteByKey(SCart sCart);
    void updateCart(SCart sCart);
    PageResult<SCart> searchPageByCriteria(CartCriteria cartCriteria);
}
