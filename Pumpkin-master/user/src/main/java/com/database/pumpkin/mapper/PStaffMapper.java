package com.database.pumpkin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.database.pumpkin.domain.entity.PStaff;
import com.database.pumpkin.mapper.base.MyMapper;
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
public interface PStaffMapper extends MyMapper<PStaff> {
    PStaff selectUserByName(@Param("sid") String sid);
}
