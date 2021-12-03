package com.database.pumpkin.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.database.pumpkin.common.page.PageResult;
import com.database.pumpkin.domain.Criteria.SOrderCriteria;
import com.database.pumpkin.domain.entity.SOrder;
import com.database.pumpkin.domain.vo.PriceVo;
import com.database.pumpkin.mapper.SOrderMapper;
import com.database.pumpkin.service.Base.BaseService;
import com.database.pumpkin.service.ISOrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.database.pumpkin.service.Base.impl.BaseServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author whl
 * @since 2021-11-22
 */
@Service
@Transactional
@RequiredArgsConstructor
public class SOrderServiceImpl extends BaseServiceImpl<SOrder> implements ISOrderService {
    private final SOrderMapper som;
    @Override
    public PageResult<SOrder> selectByCustomerId(SOrderCriteria sOrderCriteria) {
        Integer currentPage = sOrderCriteria.getCurrentPage();
        Integer pageSize = sOrderCriteria.getPageSize();

        if (StringUtils.isEmpty(currentPage)) {
            currentPage = 1;
        }
        if (StringUtils.isEmpty(pageSize)) {
            pageSize = 5;
        }

        PageHelper.startPage(currentPage, pageSize);


        List<SOrder> orders=som.selectByCustomerId(sOrderCriteria);
        PageInfo<SOrder> brandPageInfo = new PageInfo<>(orders);

        long total = brandPageInfo.getTotal();

        //brandList ------>brandVoList



        return new PageResult<SOrder>(total, orders);
    }

    @Override
    public SOrder selectByOrderId(Integer orderId) {
        SOrder order=som.selectByOrderId(orderId);
        return order;
    }
    @Override
    public Double getCurrentPrice(SOrder sOrder){
        Double price;
        PriceVo temp=som.getPrice(sOrder);
        price=temp.getMPrice()* temp.getDiscount();
        return price;
    }
}
