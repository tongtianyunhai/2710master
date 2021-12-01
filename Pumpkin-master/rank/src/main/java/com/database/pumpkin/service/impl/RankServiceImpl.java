package com.database.pumpkin.service.impl;

import com.database.pumpkin.domain.criteria.base.BaseQueryCriteria;
import com.database.pumpkin.domain.vo.RankInfoVo;
import com.database.pumpkin.mapper.RankMapper;
import com.database.pumpkin.service.Base.BaseService;
import com.database.pumpkin.service.Base.impl.BaseServiceImpl;
import com.database.pumpkin.service.RankService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * @Author：geliyang
 * @Version：1.0
 * @Date：2021/11/30-23:46
 * @Since:jdk1.8
 * @Description:TODO
 */
@Service
@Transactional
@RequiredArgsConstructor
public class RankServiceImpl extends BaseServiceImpl<RankInfoVo> implements RankService {
    private final RankMapper rankMapper;
    @Override
    public RankInfoVo RankByTopOne(BaseQueryCriteria baseQueryCriteria) {
        return rankMapper.RankByTopOne(baseQueryCriteria);
    }

    @Override
    public RankInfoVo TheAmount(BaseQueryCriteria baseQueryCriteria) {
        return rankMapper.TheAmount(baseQueryCriteria);
    }

    @Override
    public List<RankInfoVo> TopTen(BaseQueryCriteria baseQueryCriteria) {
        return rankMapper.TopTen(baseQueryCriteria);
    }
}
