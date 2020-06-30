package com.lovoteweb.mallproject.controller;

import com.lovoteweb.mallproject.common.CommonPage;
import com.lovoteweb.mallproject.common.CommonResult;
import com.lovoteweb.mallproject.mbg.model.ProProductCategory;
import com.lovoteweb.mallproject.service.serviceImpl.ProProductCategoryServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 */
@RestController
@RequestMapping("/categpory")
@Api(value = "ProProductCategoryController",description = "商品分类")
public class ProProductCategoryController {

    @Autowired
    private ProProductCategoryServiceImpl proProductCategoryService;

    /**
     *
     * @return
     */
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    public CommonResult getCategoryList(){
        return CommonResult.success(proProductCategoryService.listAllProProductCategory());
    }

    /**
     *
     * @param proProductCategory
     * @return
     */
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public CommonResult createCategory(@RequestBody ProProductCategory proProductCategory){
        CommonResult commonResult;
        int count = proProductCategoryService.createCategory(proProductCategory);
        if(count == 1){
            commonResult = CommonResult.success(proProductCategory);
        }else {
            commonResult = CommonResult.failed("新增失败");
        }

        return commonResult;
    }

    /**
     *
     * @param id
     * @param proProductCategory
     * @return
     */
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    public CommonResult updateCategory(@RequestParam("id") Long id,@RequestBody ProProductCategory proProductCategory){
        CommonResult commonResult;

        int count = proProductCategoryService.updateCategory(id,proProductCategory);

        if(count == 1){
            commonResult = CommonResult.success(proProductCategory);
        }else {
            commonResult = CommonResult.failed("更新失败");
        }

        return commonResult;
    }

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.POST)
    public CommonResult deleteCategory(@RequestParam("id") Long id){
        CommonResult commonResult;

        int count = proProductCategoryService.deleteCategory(id);

        if(count == 1){
            commonResult = CommonResult.success(null,"删除成功");
        }else {
            commonResult = CommonResult.failed("删除失败");
        }
        return commonResult;
    }

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public CommonResult category(@RequestParam("id") Long id){
        return CommonResult.success(proProductCategoryService.getCategory(id));
    }

    /**
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public CommonResult listCategory(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                     @RequestParam(value = "pageSize",defaultValue = "3") Integer pageSize){
        List<ProProductCategory> proProductCategories = proProductCategoryService.listCategory(pageNum, pageSize);
        return CommonResult.success(proProductCategories);
    }


}
