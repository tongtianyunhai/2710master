package com.database.pumpkin.controller;

import com.database.pumpkin.common.http.AxiosResult;
import com.database.pumpkin.controller.base.BaseController;
import com.database.pumpkin.domain.entity.PStaff;
import com.database.pumpkin.service.IPStaffService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
@RequestMapping("pstaff")
public class PStaffController extends BaseController {
    @Autowired
    private IPStaffService ipStaffService;

    @GetMapping("searchStaffById/{sid}")
    @ApiOperation(value = "searchById",notes="searchCustomerById")
    public AxiosResult<List<PStaff>> searchPageByCriteria(@PathVariable Integer sid){
        PStaff pStaff=ipStaffService.findById(sid);
        List<PStaff>list= new ArrayList<>();
        if(pStaff.getSid()!=null) {
            list.add(pStaff);
        };
        if(list!=null) {
            return AxiosResult.success(list);
        }else {
            return AxiosResult.error();
        }
    }


    @ApiOperation(value = "CreateNewStaff", notes = "CreateNewStaff")
    @PostMapping  ("save")
    public AxiosResult<Integer> save(@RequestBody PStaff pStaff) {
        int save = ipStaffService.save(pStaff);
        return toAxiosResult(save);
    }
    @ApiOperation(value = "updateStaffInfo", notes = "updateStaffInfo")
    @PutMapping("update")
    public AxiosResult<Integer> update(@RequestBody PStaff pStaff){
        int update = ipStaffService.updateById(pStaff);
        return toAxiosResult(update);
    }
    @ApiOperation(value = "deleteStaffInfo", notes = "deleteStaffInfo")
    @DeleteMapping("delete/{sid}")
    public  AxiosResult<Integer> update(@PathVariable Long sid){
        int delete = ipStaffService.deleteById(sid);
        return toAxiosResult(delete);
    }
}
