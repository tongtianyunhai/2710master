package com.database.pumpkin.controller;


import com.database.pumpkin.common.http.AxiosResult;
import com.database.pumpkin.common.page.PageResult;
import com.database.pumpkin.common.picture.UpPhotoNameUtils;
import com.database.pumpkin.controller.base.BaseController;
import com.database.pumpkin.domain.criteria.MMerchandiseCriteria;
import com.database.pumpkin.domain.entity.MMerchandise;
import com.database.pumpkin.domain.entity.PUser;
import com.database.pumpkin.domain.vo.MMerchandiseVo;
import com.database.pumpkin.service.IMMerchandiseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
public class MMerchandiseController extends BaseController {
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

    @ApiOperation(value = "addNewMerchandise", notes = "addNewMerchandise")
    @PostMapping("save")
    public AxiosResult<Integer> save(@RequestBody MMerchandise mMerchandise){
        int save = imMerchandiseService.save(mMerchandise);
        return toAxiosResult(save);
    }
    @PutMapping("update")
    @ApiOperation(value = "updateBrand",notes="update")
    public AxiosResult<Integer> update(@RequestBody MMerchandiseVo mMerchandiseVo){
        int update = this.imMerchandiseService.updateByNameAndmBn(mMerchandiseVo);
        return toAxiosResult(update);
    }

    @PostMapping("/upload")
    public  AxiosResult<Integer> singleFileUpload(@RequestParam("file") MultipartFile file, String mBn,String mName) {

        try {
            byte[] bytes = file.getBytes();
            String imageFileName = file.getOriginalFilename();
            String fileName = UpPhotoNameUtils.getPhotoName("img",imageFileName);
            Path path = Paths.get("E:\\2710vue\\2710\\Pumpkin\\src\\assets\\MerchandiseImages\\" + fileName);
            //E:\2710vue\2710\Pumpkin\src\assets\images\”为本地目录
            Files.write(path, bytes);//写入文件
            String avatar_url=fileName;
            MMerchandise mMerchandise=new MMerchandise();
            mMerchandise.setUrl(avatar_url);
            mMerchandise.setMBn(mBn);
            mMerchandise.setMName(mName);
            int update = imMerchandiseService.updateById(mMerchandise);
//            System.out.println(fileName+"\n");
            return toAxiosResult(update);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return AxiosResult.error();
    }
}
