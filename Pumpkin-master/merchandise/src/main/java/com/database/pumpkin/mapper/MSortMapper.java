package com.database.pumpkin.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.database.pumpkin.domain.vo.MSortVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author whl
 * @since 2021-10-30
 */
@Repository
public interface MSortMapper extends BaseMapper<MSortVo> {
        //Search-allsort
    List<MSortVo>selectsort();


}
