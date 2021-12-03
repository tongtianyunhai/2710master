package com.database.pumpkin.controller;


import com.database.pumpkin.common.http.AxiosResult;
import com.database.pumpkin.common.page.PageResult;
import com.database.pumpkin.controller.base.BaseController;
import com.database.pumpkin.domain.Criteria.SOrderCriteria;
import com.database.pumpkin.domain.entity.MSort;
import com.database.pumpkin.domain.entity.SOrder;
import com.database.pumpkin.service.ISOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@Api(value="SorderController",description = "orderMangament")
@RequestMapping("Sorder")
public class SorderController extends BaseController {
    @Autowired
    private ISOrderService isos;

    @ApiOperation(value = "addNewOrder", notes = "addNewOrder")
    @PostMapping("place_order")
    public AxiosResult<Integer> addNewOrder(@RequestBody SOrder sOrder){
        sOrder.setPrice(isos.getCurrentPrice(sOrder));
        String time=String.valueOf(System.currentTimeMillis());
        sOrder.setOrderId(time);
        sOrder.setDatetime(LocalDateTime.now());
        int save = isos.save(sOrder);
        return toAxiosResult(save);
    }
    @ApiOperation(value = "addMultipuleOrders", notes = "addMultipuleOrders")
    @PostMapping("batch_place_order")
    public AxiosResult<Integer> addMultipuleOrders(@RequestBody List<SOrder> sOrders){
        Integer save =0;
        String time=String.valueOf(System.currentTimeMillis());

        for(SOrder sOrder:sOrders){
            SOrder temp=sOrder;
            temp.setOrderId(time);
              save += isos.save(temp);}

        return toAxiosResult(save);
    }

    @GetMapping("getOrderList")
    @ApiOperation(value = "getOrderList",notes="getPersonalOrderList")
    public AxiosResult<PageResult<SOrder>> getOrderList(SOrderCriteria sOrderCriteria){
        PageResult<SOrder> list= isos.selectByCustomerId(sOrderCriteria);
        return AxiosResult.success(list);
    }

    @GetMapping("getOrderDetail")
    @ApiOperation(value = "getOrderDetail",notes="getOrderDetailbyUsingOrderId")
    public AxiosResult<SOrder> getOrderDetail(SOrderCriteria sOrderCriteria){
        Integer orderId=sOrderCriteria.orderId;
        SOrder order=isos.selectByOrderId(orderId);
        return AxiosResult.success(order);
    }
}
