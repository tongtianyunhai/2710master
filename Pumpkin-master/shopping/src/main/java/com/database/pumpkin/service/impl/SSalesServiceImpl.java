package com.database.pumpkin.service.impl;

import com.database.pumpkin.domain.entity.SCart;
import com.database.pumpkin.domain.entity.SSales;
import com.database.pumpkin.mapper.SCartMapper;
import com.database.pumpkin.mapper.SSalesMapper;
import com.database.pumpkin.service.Base.impl.BaseServiceImpl;
import com.database.pumpkin.service.ISSalesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public SSales findByDetailById(Integer merchandiseId) {
        return ssm.findByDetailById(merchandiseId);
    }
}
