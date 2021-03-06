package com.database.pumpkin.service;


import com.database.pumpkin.domain.entity.PCustomer;
import com.database.pumpkin.domain.vo.PCustomerVo;
import com.database.pumpkin.service.Base.BaseService;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author whl
 * @since 2021-10-11
 */
public interface IPCustomerService extends BaseService<PCustomer> {
    Integer updateUserByUid(PCustomerVo pCustomerVo);
    Integer updateUserAvatarByUid(PCustomerVo pCustomerVo);

}
