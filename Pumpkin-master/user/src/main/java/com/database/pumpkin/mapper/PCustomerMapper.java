package com.database.pumpkin.mapper;

import com.database.pumpkin.domain.entity.PCustomer;
import com.database.pumpkin.domain.vo.PCustomerVo;
import com.database.pumpkin.mapper.base.MyMapper;
import org.springframework.stereotype.Repository;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author whl
 * @since 2021-10-11
 */
@Repository
public interface PCustomerMapper extends MyMapper<PCustomer> {
    Integer updateUserByUid(PCustomerVo pCustomerVo);
    Integer updateUserAvatarByUid(PCustomerVo pCustomerVo);
}
