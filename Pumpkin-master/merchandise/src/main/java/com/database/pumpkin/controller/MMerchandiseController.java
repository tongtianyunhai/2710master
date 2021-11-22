package com.database.pumpkin.controller;


import com.database.pumpkin.common.http.AxiosResult;
import com.database.pumpkin.common.page.PageResult;
import com.database.pumpkin.domain.criteria.MMerchandiseCriteria;
import com.database.pumpkin.domain.vo.MMerchandiseVo;
import com.database.pumpkin.service.IMMerchandiseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author whl
 * @since 2021-10-14
 */
@RestController
@RequestMapping("/merchandise")
@Api(value="MerchandiseController",description = "merchandiseMangament")
public class MMerchandiseController {
    @Autowired
    private IMMerchandiseService imMerchandiseService;


    @GetMapping("searchPageByCriteria")
    @ApiOperation(value = "searchMerchandise",notes="searchMerchandiseByCriteria")
    public AxiosResult<PageResult<MMerchandiseVo>> searchPageByCriteria(MMerchandiseCriteria mMerchandiseCriteria){
        PageResult<MMerchandiseVo> list=imMerchandiseService.searchPageByCriteria(mMerchandiseCriteria);
        return AxiosResult.success(list);
    }

    @PutMapping("delete")
    @ApiOperation(value = "deleteMerchandise",notes="fakedelete")
    public AxiosResult<Integer> deleteMerchandise(@RequestBody MMerchandiseVo mMerchandiseVo){
        Integer integer = this.imMerchandiseService.deleteByNameAndmBn(mMerchandiseVo);
        return AxiosResult.success(integer);
    }


}