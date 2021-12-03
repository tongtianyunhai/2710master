package com.database.pumpkin.controller;


import com.database.pumpkin.common.http.AxiosResult;


import com.database.pumpkin.common.picture.UpPhotoNameUtils;
import com.database.pumpkin.controller.base.BaseController;
import com.database.pumpkin.domain.entity.PCustomer;
import com.database.pumpkin.domain.vo.PCustomerVo;
import com.database.pumpkin.service.IPCustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

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
        if(pCustomerVo.getPassWord()!=null){
            String md5PassWord=DigestUtils.md5DigestAsHex(pCustomerVo.getPassWord().getBytes());
            pCustomerVo.setPassWord(md5PassWord);
        }
        int update = ipCustomerService.updateUserByUid(pCustomerVo);
        return toAxiosResult(update);
    }
    @GetMapping("List")
    @ApiOperation(value = "searchCustomerInfo",notes="searchAll")
    public AxiosResult<List<PCustomer>> findAll(){
        List<PCustomer> list=ipCustomerService.list();
        return AxiosResult.success(list);
    }
    @ApiOperation(value = "addNewCustomerInfo", notes = "addNewCustomerInfo")
    @PostMapping("save")
    public AxiosResult<Integer> save(@RequestBody PCustomer pCustomer){
        int save = ipCustomerService.save(pCustomer);
        return toAxiosResult(save);
    }

    @PostMapping("/upload")
    public  AxiosResult<Integer> singleFileUpload(@RequestParam("file") MultipartFile file, String uid) {
        //@RequestParam("file") MultipartFile file为接收图片参数
        //Long userId,String status 用户Id和状态
        try {
            byte[] bytes = file.getBytes();
            String imageFileName = file.getOriginalFilename();
            String fileName = UpPhotoNameUtils.getPhotoName("img",imageFileName);
            Path path = Paths.get("E:\\2710vue\\2710\\Pumpkin\\src\\assets\\images\\" + fileName);
            //E:\2710vue\2710\Pumpkin\src\assets\images\”为本地目录
            Files.write(path, bytes);//写入文件
            String avatar_url=fileName;
            PCustomerVo pCustomerVo=new PCustomerVo();
            pCustomerVo.setUrl(avatar_url);
            pCustomerVo.setUid(uid);
            int update = ipCustomerService.updateUserByUid(pCustomerVo);
//            System.out.println(fileName+"\n");
            return toAxiosResult(update);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return AxiosResult.error();
    }



}
