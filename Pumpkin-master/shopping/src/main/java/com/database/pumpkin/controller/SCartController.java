package com.database.pumpkin.controller;


import com.database.pumpkin.common.http.AxiosResult;
import com.database.pumpkin.common.page.PageResult;
import com.database.pumpkin.controller.base.BaseController;
import com.database.pumpkin.domain.Criteria.CartCriteria;
import com.database.pumpkin.domain.Criteria.SalesCriteria;
import com.database.pumpkin.domain.entity.SSales;
import com.database.pumpkin.service.ISCartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.database.pumpkin.domain.entity.SCart;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author whl
 * @since 2021-11-23
 */
@RestController
@Api(value="ScartController",description = "cartMangament")
@RequestMapping("SCart")
public class SCartController  extends BaseController {
    @Autowired
    private ISCartService iscs;
    @ApiOperation(value = "addToCart", notes = "addToCart")
    @PostMapping("add_Cart")
    public AxiosResult<Integer> addToCart(@RequestBody SCart sCart){
        int save = iscs.save(sCart);
        return toAxiosResult(save);
    }

    @ApiOperation(value = "removeFromCart", notes = "removeFromCart")
    @PostMapping("remove_from_Cart")
    public void removeFromCart(@RequestBody SCart sCart){
        iscs.deleteByKey(sCart);
    }

    @ApiOperation(value = "removemultiFromCart", notes = "removemultiFromCart")
    @PostMapping("remove_batch_from_Cart")
    public void removemultiFromCart(@RequestBody List<SCart> sCarts){
        for(SCart sCart:sCarts){
            iscs.deleteByKey(sCart);}

    }

    @ApiOperation(value = "updateCart", notes = "updateCart")
    @PostMapping("updateCart")
    public void updateCart(@RequestBody SCart sCart){
        iscs.updateCart(sCart);
    }

    @ApiOperation(value = "searchCartById", notes = "searchCartById")
    @GetMapping("select_cart_info")
    public AxiosResult<PageResult<SCart>> searchCartById(CartCriteria cartCriteria){
        PageResult<SCart> sCarts= iscs.searchPageByCriteria(cartCriteria);
        return AxiosResult.success(sCarts);
    }
}
