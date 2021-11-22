package com.database.pumpkin.mapper;


import com.database.pumpkin.domain.criteria.MBrandCriteria;
import com.database.pumpkin.domain.entity.MSort;
import com.database.pumpkin.mapper.base.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author：geliyang
 * @Version：1.0
 * @Date：2021/11/4-22:34
 * @Since:jdk1.8
 * @Description:TODO
 */
@Repository
public interface MBrandMapper extends MyMapper<MSort> {
    List<MSort> selectByParams(MBrandCriteria mBrandCriteria);

    Integer deleteById(Integer sid);
    List<MSort> selectType();
//    int updateById(MSort mSort);
//    MSort queryById(Integer sid);

}
