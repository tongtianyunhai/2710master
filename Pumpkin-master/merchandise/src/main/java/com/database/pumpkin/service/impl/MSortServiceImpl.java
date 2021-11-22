package com.database.pumpkin.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.database.pumpkin.domain.entity.MSort;
import com.database.pumpkin.domain.vo.MSortVo;
import com.database.pumpkin.mapper.MSortMapper;
import com.database.pumpkin.service.IMSortService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author whl
 * @since 2021-10-30
 */
@Service
@Transactional
@RequiredArgsConstructor
public class MSortServiceImpl extends ServiceImpl<MSortMapper, MSortVo> implements IMSortService {

    private final MSortMapper mSortMapper;
    @Override
    public List<MSortVo> selectsort() {
        return  mSortMapper.selectsort();
    }



}
