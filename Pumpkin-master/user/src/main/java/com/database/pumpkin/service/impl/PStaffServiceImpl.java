package com.database.pumpkin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.database.pumpkin.domain.entity.PStaff;
import com.database.pumpkin.mapper.PStaffMapper;
import com.database.pumpkin.service.IPStaffService;
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
public class PStaffServiceImpl extends ServiceImpl<PStaffMapper, PStaff> implements IPStaffService {

}
