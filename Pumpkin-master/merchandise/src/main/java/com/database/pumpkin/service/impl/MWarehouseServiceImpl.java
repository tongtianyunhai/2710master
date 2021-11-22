package com.database.pumpkin.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.database.pumpkin.domain.entity.MWarehouse;
import com.database.pumpkin.mapper.MWarehouseMapper;
import com.database.pumpkin.service.IMWarehouseService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author whl
 * @since 2021-10-14
 */
@Service
public class MWarehouseServiceImpl extends ServiceImpl<MWarehouseMapper, MWarehouse> implements IMWarehouseService {

}
