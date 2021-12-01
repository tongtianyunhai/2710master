package com.database.pumpkin.mapper;

import com.database.pumpkin.domain.criteria.base.BaseQueryCriteria;
import com.database.pumpkin.domain.vo.RankInfoVo;
import com.database.pumpkin.mapper.base.MyMapper;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * @Author：geliyang
 * @Version：1.0
 * @Date：2021/11/30-23:39
 * @Since:jdk1.8
 * @Description:TODO
 */
@Repository
public interface RankMapper extends MyMapper<RankInfoVo> {
 RankInfoVo RankByTopOne(BaseQueryCriteria baseQueryCriteria);
 RankInfoVo TheAmount(BaseQueryCriteria baseQueryCriteria);
 List<RankInfoVo> TopTen(BaseQueryCriteria baseQueryCriteria);
}
