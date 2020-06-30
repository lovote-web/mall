package com.lovoteweb.mallproject.controller;

import com.lovoteweb.mallproject.common.CommonResult;
import com.lovoteweb.mallproject.mbg.model.OmsCartItem;
import com.lovoteweb.mallproject.service.OmsCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class OmsCartController {

    @Autowired
    private OmsCartService omsCartService;

    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    public CommonResult ListCartAll(){
        return CommonResult.success(omsCartService.listCartAll());
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public CommonResult createCart(@RequestBody OmsCartItem omsCartItem){
        int count = omsCartService.createCart(omsCartItem);
        if(count == 1){
            return CommonResult.success(omsCartItem);
        }else {
            return CommonResult.failed("新增失败");
        }
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public CommonResult deleteCart(@PathVariable Long id){
        int count = omsCartService.deleteCart(id);
        if(count == 1){
            return CommonResult.success(null,"删除成功");
        }else {
            return CommonResult.failed("删除失败");
        }
    }
}
