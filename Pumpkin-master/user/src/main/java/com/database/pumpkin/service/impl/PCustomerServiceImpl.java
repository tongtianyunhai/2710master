package com.database.pumpkin.service.impl;


import com.database.pumpkin.domain.entity.PCustomer;
import com.database.pumpkin.domain.vo.PCustomerVo;
import com.database.pumpkin.mapper.PCustomerMapper;
import com.database.pumpkin.service.Base.impl.BaseServiceImpl;
import com.database.pumpkin.service.IPCustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author whl
 * @since 2021-10-11
 */
@Service
@Transactional
@RequiredArgsConstructor
public class PCustomerServiceImpl extends BaseServiceImpl<PCustomer> implements IPCustomerService {
    private final PCustomerMapper pCustomerMapper;


    @Override
    public Integer updateUserByUid(PCustomerVo pCustomerVo) {
        return pCustomerMapper.updateUserByUid(pCustomerVo);
    }
}
