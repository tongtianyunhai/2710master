package com.database.pumpkin.controller;


import com.database.pumpkin.common.http.AxiosResult;
import com.database.pumpkin.common.page.PageResult;
import com.database.pumpkin.controller.base.BaseController;
import com.database.pumpkin.domain.Criteria.SalesCriteria;
import com.database.pumpkin.domain.entity.SCart;
import com.database.pumpkin.domain.entity.SSales;
import com.database.pumpkin.service.ISCartService;
import com.database.pumpkin.service.ISSalesService;
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
 * @since 2021-11-23
 */
@RestController
@Api(value="salesController",description = "salesMangament")
@RequestMapping("SSale")
public class SSalesController extends BaseController {
    @Autowired
    private ISSalesService isss;
    @ApiOperation(value = "addSaleInformation", notes = "addSaleInformation")
    @PostMapping("add_sales")
    public AxiosResult<Integer> addToSale(@RequestBody SSales sSales){
        int save = isss.save(sSales);
        return toAxiosResult(save);
    }

    @ApiOperation(value = "updateSales", notes = "updateSales")
    @PostMapping("updateSales")//////////////////////////////////////////////////////////////////////////////////////
    public void updateCart(@RequestBody SSales sSales){
        isss.updateSales(sSales);
    }

    @ApiOperation(value = "searchSaleInformationById", notes = "searchSaleInformationById")
    @GetMapping("search_sales_info")
    public AxiosResult<PageResult<SSales>> searchSaleInformationById(SalesCriteria salesCriteria){
        PageResult<SSales> sales= isss.searchPageByCriteria(salesCriteria);
        return AxiosResult.success(sales);
    }
}
