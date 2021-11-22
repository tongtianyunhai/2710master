package com.database.pumpkin.service.impl;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.database.pumpkin.common.page.PageResult;
import com.database.pumpkin.domain.criteria.MMerchandiseCriteria;
import com.database.pumpkin.domain.entity.MMerchandise;
import com.database.pumpkin.domain.vo.MMerchandiseVo;
import com.database.pumpkin.mapper.MMerchandiseMapper;
import com.database.pumpkin.service.Base.BaseService;
import com.database.pumpkin.service.Base.impl.BaseServiceImpl;
import com.database.pumpkin.service.IMMerchandiseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author whl
 * @since 2021-10-14
 */
@Service
@Transactional
@RequiredArgsConstructor
public class MMerchandiseServiceImpl extends BaseServiceImpl<MMerchandise> implements IMMerchandiseService {
    private final MMerchandiseMapper mMerchandiseMapper;

    @Override
    public PageResult<MMerchandiseVo> searchPageByCriteria(MMerchandiseCriteria mMerchandiseCriteria) {
        Integer currentPage = mMerchandiseCriteria.getCurrentPage();
        Integer pageSize = mMerchandiseCriteria.getPageSize();

        if (StringUtils.isEmpty(currentPage)) {
            currentPage = 1;
        }
        if (StringUtils.isEmpty(pageSize)) {
            pageSize = 5;
        }

        PageHelper.startPage(currentPage, pageSize);



        List<MMerchandiseVo> brandList = mMerchandiseMapper.selectByParams(mMerchandiseCriteria);

        PageInfo<MMerchandiseVo> brandPageInfo = new PageInfo<>(brandList);

        long total = brandPageInfo.getTotal();

        //brandList ------>brandVoList



        return new PageResult<MMerchandiseVo>(total, brandList);
    }

    @Override
    public Integer deleteByNameAndmBn(MMerchandiseVo mMerchandiseVo) {
        return mMerchandiseMapper.deleteByNameAndmBn(mMerchandiseVo);
    }


}
