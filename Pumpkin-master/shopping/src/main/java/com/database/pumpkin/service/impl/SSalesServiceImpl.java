package com.database.pumpkin.service.impl;

import com.database.pumpkin.common.page.PageResult;
import com.database.pumpkin.domain.Criteria.SalesCriteria;
import com.database.pumpkin.domain.entity.SCart;
import com.database.pumpkin.domain.entity.SSales;
import com.database.pumpkin.mapper.SCartMapper;
import com.database.pumpkin.mapper.SSalesMapper;
import com.database.pumpkin.service.Base.impl.BaseServiceImpl;
import com.database.pumpkin.service.ISSalesService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author whl
 * @since 2021-11-23
 */
@Service
@Transactional
@RequiredArgsConstructor
public class SSalesServiceImpl  extends BaseServiceImpl<SSales> implements ISSalesService {
    private final SSalesMapper ssm;

    @Override
    public void updateSales(SSales sSales) {
        ssm.updateSales(sSales);
    }

    @Override
    public SSales findByDetailById(SSales sSales) {
        return ssm.findByDetailById(sSales);
    }

    @Override
    public PageResult<SSales> searchPageByCriteria(SalesCriteria salesCriteria) {
        Integer currentPage = salesCriteria.getCurrentPage();
        Integer pageSize = salesCriteria.getPageSize();

        if (StringUtils.isEmpty(currentPage)) {
            currentPage = 1;
        }
        if (StringUtils.isEmpty(pageSize)) {
            pageSize = 5;
        }

        PageHelper.startPage(currentPage, pageSize);



        List<SSales> brandList = ssm.selectByParams(salesCriteria);

        PageInfo<SSales> brandPageInfo = new PageInfo<>(brandList);

        long total = brandPageInfo.getTotal();

        //brandList ------>brandVoList



        return new PageResult<SSales>(total, brandList);
    }
}
