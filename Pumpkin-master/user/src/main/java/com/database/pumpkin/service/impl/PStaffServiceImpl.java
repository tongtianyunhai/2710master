package com.database.pumpkin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.database.pumpkin.domain.entity.PStaff;
import com.database.pumpkin.mapper.PStaffMapper;
import com.database.pumpkin.service.Base.BaseService;
import com.database.pumpkin.service.Base.impl.BaseServiceImpl;
import com.database.pumpkin.service.IPStaffService;
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
public class PStaffServiceImpl extends BaseServiceImpl<PStaff> implements IPStaffService {
    private final PStaffMapper pUserMapper;
    @Override
    public PStaff findUser(String userName) {
        return pUserMapper.selectUserByName(userName);
    }
}
