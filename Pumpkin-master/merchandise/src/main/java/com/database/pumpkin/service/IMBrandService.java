package com.database.pumpkin.service;

import com.database.pumpkin.common.page.PageResult;
import com.database.pumpkin.domain.criteria.MBrandCriteria;
import com.database.pumpkin.domain.entity.MSort;
import com.database.pumpkin.service.Base.BaseService;


import java.util.List;

/**
 * @Author：geliyang
 * @Version：1.0
 * @Date：2021/11/4-22:35
 * @Since:jdk1.8
 * @Description:TODO
 */
public interface IMBrandService extends BaseService<MSort> {
    PageResult<MSort> searchPageByCriteria(MBrandCriteria brandCriteria);
    Integer deleteById(Integer sid);
    List<MSort> selectType();
//    MSort update(MSort mSort);
//    MSort queryById(Integer sid);

}
