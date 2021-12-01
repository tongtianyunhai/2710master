package com.database.pumpkin.controller;

import com.database.pumpkin.common.http.AxiosResult;
import com.database.pumpkin.controller.base.BaseController;
import com.database.pumpkin.domain.criteria.base.BaseQueryCriteria;
import com.database.pumpkin.domain.vo.RankInfoVo;
import com.database.pumpkin.service.RankService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author：geliyang
 * @Version：1.0
 * @Date：2021/11/30-23:51
 * @Since:jdk1.8
 * @Description:TODO
 */
@RestController
@RequestMapping("rank")
public class RankController extends BaseController {

    @Autowired
    private RankService rankService;
    @ApiOperation(value = "RankByTopOne", notes = "RankByTopOne")
    @GetMapping("RankByTopOne")
    public AxiosResult<List<RankInfoVo>> RankByTopOne(BaseQueryCriteria baseQueryCriteria) {
        RankInfoVo rankInfoVo=rankService.RankByTopOne(baseQueryCriteria);
        List<RankInfoVo>list=new LinkedList<>();
        list.add(rankInfoVo);
            return AxiosResult.success(list);
    }

    @ApiOperation(value = "TheAmount", notes = "TheAmount")
    @GetMapping("TheAmount")
    public AxiosResult<List<RankInfoVo>> TheAmount(BaseQueryCriteria baseQueryCriteria) {
        RankInfoVo rankInfoVo=rankService.TheAmount(baseQueryCriteria);
        List<RankInfoVo>list=new LinkedList<>();
        list.add(rankInfoVo);
        return AxiosResult.success(list);
    }

    @ApiOperation(value = "TopTen", notes = "TopTen")
    @GetMapping("TopTen")
    public AxiosResult<List<RankInfoVo>> TopTen(BaseQueryCriteria baseQueryCriteria) {
        List rankInfoVo=rankService.TopTen(baseQueryCriteria);
        return AxiosResult.success(rankInfoVo);
    }
}
