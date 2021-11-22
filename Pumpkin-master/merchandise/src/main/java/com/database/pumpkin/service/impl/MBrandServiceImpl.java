package com.database.pumpkin.service.impl;


import com.database.pumpkin.common.page.PageResult;
import com.database.pumpkin.domain.criteria.MBrandCriteria;
import com.database.pumpkin.domain.entity.MSort;
import com.database.pumpkin.mapper.MBrandMapper;
import com.database.pumpkin.service.Base.impl.BaseServiceImpl;
import com.database.pumpkin.service.IMBrandService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Author：geliyang
 * @Version：1.0
 * @Date：2021/11/4-22:36
 * @Since:jdk1.8
 * @Description:TODO
 */
@Service
@Transactional
@RequiredArgsConstructor
public class MBrandServiceImpl extends BaseServiceImpl<MSort> implements IMBrandService {

    private final MBrandMapper mBrandMapper;

    //delete brand by sid
    @Override
    public Integer deleteById(Integer sid) {
        return this.mBrandMapper.deleteById(sid);
    }

    //selectType
    @Override
    public List<MSort> selectType() {
        return this.mBrandMapper.selectType();
    }

//    @Override
//    public MSort update(MSort mSort) {
//        this.mBrandMapper.updateById(mSort);
//        return this.queryById(mSort.getSid());
//    }
//
//    @Override
//    public MSort queryById(Integer sid) {
//        return null;
//    }


    @Override
    public PageResult<MSort> searchPageByCriteria(MBrandCriteria mBrandCriteria){
        Integer currentPage = mBrandCriteria.getCurrentPage();
        Integer pageSize = mBrandCriteria.getPageSize();

        if (StringUtils.isEmpty(currentPage)) {
            currentPage = 1;
        }
        if (StringUtils.isEmpty(pageSize)) {
            pageSize = 5;
        }

        PageHelper.startPage(currentPage, pageSize);



        List<MSort> brandList = mBrandMapper.selectByParams(mBrandCriteria);

        PageInfo<MSort> brandPageInfo = new PageInfo<>(brandList);

        long total = brandPageInfo.getTotal();

        //brandList ------>brandVoList



        return new PageResult<MSort>(total, brandList);


    }

}
