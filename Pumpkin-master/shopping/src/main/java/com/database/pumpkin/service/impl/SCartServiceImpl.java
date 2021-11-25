package com.database.pumpkin.service.impl;

import com.database.pumpkin.domain.entity.SCart;
import com.database.pumpkin.service.Base.impl.BaseServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.database.pumpkin.mapper.SCartMapper;
import com.database.pumpkin.service.ISCartService;

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
}
