package com.database.pumpkin.service.impl;

import com.database.pumpkin.domain.entity.PUser;
import com.database.pumpkin.mapper.PUserMapper;
import com.database.pumpkin.service.IPUserService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class PUserServiceImpl implements IPUserService {
    @Autowired
    private PUserMapper pUserMapper;
    @Override
    public PUser findUser(String userName) {
        return pUserMapper.selectUserByName(userName);
    }
}
