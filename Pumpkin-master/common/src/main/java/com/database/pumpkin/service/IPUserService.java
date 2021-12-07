package com.database.pumpkin.service;


import com.database.pumpkin.domain.entity.PUser;
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
public interface IPUserService  extends BaseService<PUser> {
    PUser findUser(String uid);
    PCustomerVo selectUserByUid(String uid);
    Integer updateUserVaild(PUser pUser);
}
