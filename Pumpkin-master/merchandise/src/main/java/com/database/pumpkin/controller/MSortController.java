package com.database.pumpkin.controller;


import com.database.pumpkin.common.http.AxiosResult;
import com.database.pumpkin.common.page.PageResult;
import com.database.pumpkin.controller.base.BaseController;
import com.database.pumpkin.domain.criteria.MBrandCriteria;
import com.database.pumpkin.domain.entity.MSort;
import com.database.pumpkin.domain.vo.MSortVo;
import com.database.pumpkin.service.IMBrandService;
import com.database.pumpkin.service.IMSortService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author whl
 * @since 2021-10-30
 */
@RestController
@Api(value="MsortController",description = "merchandiseSortMangament")
@RequestMapping("msort")
public class MSortController extends BaseController {

    @Autowired
    private IMSortService imSortService;
    @Autowired
    private IMBrandService imBrandService;
    @GetMapping("sortList")
    @ApiOperation(value = "searchMerchandiseSort",notes="searchAll")
    public AxiosResult<List<MSortVo>> findAll(){
        List<MSortVo> list=imSortService.selectsort();
        return AxiosResult.success(list);
    }

    @GetMapping("searchPageByCriteria")
    @ApiOperation(value = "searchBrand",notes="searchAllBrand")
    public AxiosResult<PageResult<MSort>> searchPageByCriteria(MBrandCriteria mbrandCriteria){
        PageResult<MSort> list=imBrandService.searchPageByCriteria(mbrandCriteria);
        return AxiosResult.success(list);
    }
    @PutMapping("delete/{sid}")
    @ApiOperation(value = "deleteBrand",notes="fakedelete")
    public AxiosResult<Integer> deleteBrand(@PathVariable Integer sid){
        Integer integer = this.imBrandService.deleteById(sid);
        return AxiosResult.success(integer);
    }


    @GetMapping("searchType")
    @ApiOperation(value = "searchType",notes="searchAllType")
    public AxiosResult<List<MSort>> searchType(){
        List<MSort> list=imBrandService.selectType();
        return AxiosResult.success(list);
    }

    @ApiOperation(value = "addNewBrand", notes = "addNewBrand")
    @PostMapping("save")
    public AxiosResult<Integer> save(@RequestBody MSort mSort){
        int save = imBrandService.save(mSort);
        return toAxiosResult(save);
    }

    @PutMapping("update")
    @ApiOperation(value = "updateBrand",notes="update")
    public AxiosResult<Integer> update(@RequestBody MSort mSort){
        int update = this.imBrandService.updateById(mSort);
        return toAxiosResult(update);
    }
}
