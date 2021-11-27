package com.database.pumpkin.service.impl;

import com.database.pumpkin.domain.entity.PUser;
import com.database.pumpkin.domain.vo.PCustomerVo;
import com.database.pumpkin.mapper.PUserMapper;
import com.database.pumpkin.service.Base.impl.BaseServiceImpl;
import com.database.pumpkin.service.IPUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
public class PUserServiceImpl extends BaseServiceImpl<PUser> implements IPUserService {

    private final PUserMapper pUserMapper;
    @Override
    public PUser findUser(String userName) {
        return pUserMapper.selectUserByName(userName);
    }

    @Override
    public PCustomerVo selectUserByUid(Integer uid) {
        return pUserMapper.selectUserByUid(uid);
    }


}
