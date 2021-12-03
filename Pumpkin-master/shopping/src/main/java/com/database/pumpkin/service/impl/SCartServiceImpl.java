package com.database.pumpkin.service.impl;

import com.database.pumpkin.common.page.PageResult;
import com.database.pumpkin.domain.Criteria.CartCriteria;
import com.database.pumpkin.domain.Criteria.SalesCriteria;
import com.database.pumpkin.domain.entity.SCart;
import com.database.pumpkin.domain.entity.SSales;
import com.database.pumpkin.service.Base.impl.BaseServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.database.pumpkin.mapper.SCartMapper;
import com.database.pumpkin.service.ISCartService;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Scanner;

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
public class SCartServiceImpl extends BaseServiceImpl<SCart> implements ISCartService {
    private final SCartMapper som;

    @Override
    public void deleteByKey(SCart sCart) {
        som.deleteByKey(sCart);
    }

    @Override
    public void updateCart(SCart sCart) {
        som.updateCart(sCart);
    }

    @Override
    public PageResult<SCart> searchPageByCriteria(CartCriteria cartCriteria) {
        Integer currentPage = cartCriteria.getCurrentPage();
        Integer pageSize = cartCriteria.getPageSize();

        if (StringUtils.isEmpty(currentPage)) {
            currentPage = 1;
        }
        if (StringUtils.isEmpty(pageSize)) {
            pageSize = 5;
        }

        PageHelper.startPage(currentPage, pageSize);



        List<SCart> cartList = som.selectByParams(cartCriteria);

        PageInfo<SCart> cartPageInfo = new PageInfo<>(cartList);

        long total = cartPageInfo.getTotal();

        //brandList ------>brandVoList



        return new PageResult<SCart>(total, cartList);
    }
}
