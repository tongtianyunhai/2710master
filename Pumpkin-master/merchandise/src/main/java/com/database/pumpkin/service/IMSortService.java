package com.database.pumpkin.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.database.pumpkin.domain.entity.MSort;
import com.database.pumpkin.domain.vo.MSortVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author whl
 * @since 2021-10-30
 */
public interface IMSortService extends IService<MSortVo> {
        List<MSortVo> selectsort();
}
