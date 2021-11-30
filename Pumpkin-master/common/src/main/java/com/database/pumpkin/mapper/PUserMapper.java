package com.database.pumpkin.mapper;


import com.database.pumpkin.domain.entity.PUser;
import com.database.pumpkin.domain.vo.PCustomerVo;
import com.database.pumpkin.mapper.base.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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

public interface PUserMapper extends MyMapper<PUser> {
    PUser selectUserByName(@Param("userName") String userName);
    PCustomerVo selectUserByUid(@Param("uid") String uid);
}
