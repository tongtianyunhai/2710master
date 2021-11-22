package com.database.pumpkin.mapper;


import com.database.pumpkin.domain.entity.PUser;
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

public interface PUserMapper  {
    PUser selectUserByName(@Param("userName") String userName);

}
