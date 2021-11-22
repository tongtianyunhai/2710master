package com.database.pumpkin.controller;


import com.database.pumpkin.common.http.AxiosResult;
import com.database.pumpkin.controller.base.BaseController;
import com.database.pumpkin.domain.entity.PUser;
import com.database.pumpkin.service.IPUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @ApiOperation(value = "查询用户", notes = "查询所有用户")
    @PostMapping  ("selectUserByName")
    public AxiosResult<PUser> login(@RequestBody PUser puser) {
        PUser res = puserService.findUser(puser.getUserName());
        if (res.getPassWord().equals(puser.getPassWord())) {
            return AxiosResult.success(puser);
        }
        return AxiosResult.error();
    }
}
