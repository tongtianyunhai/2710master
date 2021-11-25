package com.database.pumpkin.service;

import com.database.pumpkin.domain.entity.SSales;
import com.database.pumpkin.service.Base.BaseService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author whl
 * @since 2021-11-23
 */
public interface ISSalesService  extends BaseService<SSales> {
    void updateSales(SSales sSales);
    SSales findByDetailById(Integer merchandiseId);
}
