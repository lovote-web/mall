package com.lovoteweb.mallproject.controller;

import com.lovoteweb.mallproject.common.CommonPage;
import com.lovoteweb.mallproject.common.CommonResult;
import com.lovoteweb.mallproject.mbg.model.ProBrand;
import com.lovoteweb.mallproject.service.serviceImpl.ProBrandServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author
 */
@Api(tags = "ProBrandController",description = "商品品牌管理")
@RestController
@RequestMapping("/brand")
public class ProBrandController {

    @Autowired
    ProBrandServiceImpl proBrandService;

    /**
     * 列出
     * @return
     */
    @ApiOperation("获取所有品牌列表")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    public CommonResult<Object> getBrandList(){
        return CommonResult.success(proBrandService.listAllBrand());
    }

    /**
     * 新增
     * @param proBrand
     * @return
     */
    @ApiOperation("新增品牌")
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public CommonResult createBrand(@RequestBody ProBrand proBrand){
        CommonResult commonResult;
        int count = proBrandService.createBrand(proBrand);

        if(count == 1){
            commonResult = CommonResult.success(proBrand);
        }else {
            commonResult = CommonResult.failed("操作失败");
        }

        return commonResult;
    }

    /**
     *更新
     * @param id
     * @param proBrand
     * @return
     */
    @ApiOperation("更新指定id品牌信息")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    public CommonResult updateBrand(@PathVariable("id") Long id,@RequestBody ProBrand proBrand){
        int count=proBrandService.updateBrand(id,proBrand);

        CommonResult commonResult;

        if(count==1){
            commonResult = CommonResult.success(proBrand);
        }else {
            commonResult = CommonResult.failed("更新失败");
        }

        return commonResult;
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @ApiOperation("删除指定id的品牌信息")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public CommonResult deleteBrand(@PathVariable("id") Long id){
        int count = proBrandService.deleteBrand(id);

        CommonResult commonResult;

        if(count == 1){
            commonResult = CommonResult.success(null,"删除成功");
        }else {
            commonResult = CommonResult.failed("删除失败");
        }

        return commonResult;
    }

    /**
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    @ApiOperation("分页查询品牌列表")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public CommonResult listBrand(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                  @RequestParam(value = "pageSize",defaultValue = "3") Integer pageSize){
        List<ProBrand> brandList = proBrandService.listBrand(pageNum,pageSize);
        return  CommonResult.success(CommonPage.restPage(brandList));
    }

    /**
     *获取Brand
     * @param id
     * @return
     */
    @ApiOperation("获取指定id的品牌信息")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public CommonResult brand(@PathVariable("id") Long id){
        return CommonResult.success(proBrandService.getBrand(id));
    }
}
