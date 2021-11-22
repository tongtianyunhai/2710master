package com.database.pumpkin.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.database.pumpkin.domain.entity.PCustomer;
import com.database.pumpkin.mapper.PCustomerMapper;
import com.database.pumpkin.service.IPCustomerService;
import org.springframework.stereotype.Service;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author whl
 * @since 2021-10-11
 */
@Service
public class PCustomerServiceImpl extends ServiceImpl<PCustomerMapper, PCustomer> implements IPCustomerService {

}
