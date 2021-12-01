package com.database.pumpkin.service;

import com.database.pumpkin.domain.criteria.base.BaseQueryCriteria;
import com.database.pumpkin.domain.vo.RankInfoVo;
import com.database.pumpkin.service.Base.BaseService;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * @Author：geliyang
 * @Version：1.0
 * @Date：2021/11/30-23:43
 * @Since:jdk1.8
 * @Description:TODO
 */

public interface RankService extends BaseService<RankInfoVo> {
    RankInfoVo RankByTopOne(BaseQueryCriteria baseQueryCriteria);
    RankInfoVo TheAmount(BaseQueryCriteria baseQueryCriteria);
    List<RankInfoVo> TopTen(BaseQueryCriteria baseQueryCriteria);

}
