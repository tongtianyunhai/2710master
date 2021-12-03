package com.database.pumpkin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.database.pumpkin.domain.entity.PStaff;
import com.database.pumpkin.service.Base.BaseService;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author whl
 * @since 2021-10-11
 */
public interface IPStaffService extends BaseService<PStaff> {
    PStaff findUser(String sid);
}
