package com.database.pumpkin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.database.pumpkin.domain.criteria.MMerchandiseCriteria;
import com.database.pumpkin.domain.entity.MMerchandise;
import com.database.pumpkin.domain.vo.MMerchandiseVo;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author whl
 * @since 2021-10-14
 */
@Repository
public interface MMerchandiseMapper extends BaseMapper<MMerchandise> {
    List<MMerchandiseVo> selectByParams(MMerchandiseCriteria mMerchandiseCriteria);
    Integer deleteByNameAndmBn(MMerchandiseVo mMerchandiseVo);


}
