package com.database.pumpkin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.database.pumpkin.common.page.PageResult;
import com.database.pumpkin.domain.criteria.MMerchandiseCriteria;
import com.database.pumpkin.domain.entity.MMerchandise;
import com.database.pumpkin.domain.vo.MMerchandiseVo;
import com.database.pumpkin.service.Base.BaseService;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author whl
 * @since 2021-10-14
 */
public interface IMMerchandiseService extends BaseService<MMerchandise> {
    PageResult<MMerchandiseVo> searchPageByCriteria(MMerchandiseCriteria mMerchandiseCriteria);
    Integer deleteByNameAndmBn(MMerchandiseVo mMerchandiseVo);
}
