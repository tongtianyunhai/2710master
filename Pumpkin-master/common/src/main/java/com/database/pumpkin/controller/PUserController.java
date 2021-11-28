package com.database.pumpkin.controller;


import com.database.pumpkin.common.http.AxiosResult;
import com.database.pumpkin.common.page.PageResult;
import com.database.pumpkin.controller.base.BaseController;
import com.database.pumpkin.domain.entity.PCustomer;
import com.database.pumpkin.domain.entity.PUser;
import com.database.pumpkin.domain.vo.PCustomerVo;
import com.database.pumpkin.service.IPUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gly
 * @since 2021-10-11
 */
@Api(value = "adminController", description = "用户管理")
@RequestMapping("puser")
@RestController
public class PUserController extends BaseController {

    @Autowired
    private IPUserService puserService;


    @ApiOperation(value = "查询登录用户", notes = "验证用户登录密码")
    @PostMapping  ("selectUserByName")
    public AxiosResult<PUser> login(@RequestBody PUser puser) {
        PUser res = puserService.findUser(puser.getUserName());
        String md5PassWord=DigestUtils.md5DigestAsHex(puser.getPassWord().getBytes());
        if (res.getPassWord().equals(md5PassWord)&&res.getIsvaild()!=0) {
            return AxiosResult.success(res);
        }
        return AxiosResult.error();
    }

    @ApiOperation(value = "CreateNewAccount", notes = "CreateNewAccount")
    @PostMapping  ("save")
    public AxiosResult<Integer> save(@RequestBody PUser puser) {
        String md5PassWord=DigestUtils.md5DigestAsHex(puser.getPassWord().getBytes());
        puser.setPassWord(md5PassWord);
        int save = puserService.save(puser);
        return toAxiosResult(save);
    }

    @GetMapping("searchCustomerById/{uid}")
    @ApiOperation(value = "searchById",notes="searchCustomerById")
    public AxiosResult<List<PCustomerVo>> searchPageByCriteria(@PathVariable Integer uid){
        PCustomerVo pCustomerVo=puserService.selectUserByUid(uid);
        List<PCustomerVo>list= new ArrayList<>();
        list.add(pCustomerVo);
        return AxiosResult.success(list);
    }
    @ApiOperation(value = "updateUser", notes = "updateUser")
    @PutMapping("update")
    public AxiosResult<Integer> update(@RequestBody PUser pUser){
        int update = puserService.updateById(pUser);
        return toAxiosResult(update);
    }
}
