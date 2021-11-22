package com.database.pumpkin;

import com.database.pumpkin.controller.MSortController;
import com.database.pumpkin.domain.vo.MSortVo;
import com.database.pumpkin.mapper.MSortMapper;
import com.database.pumpkin.service.IMSortService;
import com.database.pumpkin.service.impl.MSortServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author：geliyang
 * @Version：1.0
 * @Date：2021/11/1-21:58
 * @Since:jdk1.8
 * @Description:TODO
 */
@SpringBootTest(classes =PumpkinApplication.class)
public class InnerTest {
    @Autowired
    private MSortController mSortController;

    @Autowired
    private IMSortService imSortService;

    @Autowired
    private MSortMapper mSortMapper;

    @Test
    public void test(){
        List<MSortVo>mSortVos=mSortMapper.selectsort();
        System.out.println(mSortVos);

    }
}
