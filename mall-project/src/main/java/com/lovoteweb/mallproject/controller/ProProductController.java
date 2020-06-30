package com.lovoteweb.mallproject.controller;

import com.lovoteweb.mallproject.common.CommonResult;
import com.lovoteweb.mallproject.mbg.model.ProProduct;
import com.lovoteweb.mallproject.service.ProProductSerice;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/product")
@Api(value = "proproductController",description = "商品管理")
public class ProProductController {

    @Autowired
    private ProProductSerice proProductSerice;

    /**
     * 列出全部
     * @return
     */
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    public CommonResult<Object> getProductList(){
        return CommonResult.success(proProductSerice.listAll());
    }

    /**
     * 新增
     * @param proProduct
     * @return
     */
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public CommonResult createProduct(@RequestBody ProProduct proProduct){
        CommonResult commonResult;
        int count = proProductSerice.createProduct(proProduct);
        if(count == 1){
            commonResult = CommonResult.success(proProduct);
        }else {
            commonResult = CommonResult.failed("新增失败");
        }
        return commonResult;
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public CommonResult deleteProduct(@PathVariable Long id){
        CommonResult commonResult;
        int count = proProductSerice.deleteProduct(id);
        if(count == 1){
            commonResult = CommonResult.success(null,"删除成功");
        }else {
            commonResult = CommonResult.failed("删除失败");
        }
        return commonResult;
    }

    /**
     * 更新
     * @param id
     * @param proProduct
     * @return
     */
    @RequestMapping(value = "/update/{id}",method = RequestMethod.GET)
    public CommonResult updateProduct(@PathVariable Long id,@RequestBody ProProduct proProduct){
        CommonResult commonResult;
        int i = proProductSerice.updateProduct(id, proProduct);
        if(i == 1){
            commonResult = CommonResult.success(proProduct);
        }else {
            commonResult = CommonResult.failed("更新失败");
        }
        return commonResult;
    }

    /**
     * 获取商品详情
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public CommonResult listProduct(Long id){
        ProProduct product = proProductSerice.getProduct(id);
        return CommonResult.success(product);
    }

    /**
     * 分页展出
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public CommonResult listProductPage(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                        @RequestParam(value = "pageSize",defaultValue = "3") Integer pageSize){
        return CommonResult.success(proProductSerice.listProduct(pageNum,pageSize));
    }
}
