package com.database.pumpkin.controller;


import com.database.pumpkin.common.http.AxiosResult;


import com.database.pumpkin.controller.base.BaseController;
import com.database.pumpkin.domain.entity.PCustomer;
import com.database.pumpkin.domain.vo.PCustomerVo;
import com.database.pumpkin.service.IPCustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author whl
 * @since 2021-10-11
 */
@RestController
@RequestMapping("pcustomer")
@Api(value="PCustomer",description = "PCustomerMangament")
public class PCustomerController extends BaseController {

    @Autowired
    private IPCustomerService ipCustomerService;


    @ApiOperation(value = "updateCustomer", notes = "updateCustomer")
    @PutMapping("update")
    public AxiosResult<Integer> update(@RequestBody PCustomerVo pCustomerVo){
        int update = ipCustomerService.updateUserByUid(pCustomerVo);
        return toAxiosResult(update);
    }
    @GetMapping("List")
    @ApiOperation(value = "searchCustomerInfo",notes="searchAll")
    public AxiosResult<List<PCustomer>> findAll(){
        List<PCustomer> list=ipCustomerService.list();
        return AxiosResult.success(list);
    }


}
