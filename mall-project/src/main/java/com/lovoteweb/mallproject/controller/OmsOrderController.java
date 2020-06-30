package com.lovoteweb.mallproject.controller;

import com.lovoteweb.mallproject.common.CommonResult;
import com.lovoteweb.mallproject.mbg.model.OmsOrder;
import com.lovoteweb.mallproject.service.OmsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/order")
public class OmsOrderController {

    @Autowired
    private OmsOrderService omsOrderService;

    /**
     *
     * @return
     */
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    public CommonResult listOrderAll(){
        return CommonResult.success(omsOrderService.listAll());
    }

    /**
     *
     * @param omsOrder
     * @return
     */
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public CommonResult createOrder(@RequestBody OmsOrder omsOrder){
        CommonResult commonResult;
        int count = omsOrderService.createOrder(omsOrder);
        if(count == 1){
            commonResult=CommonResult.success(omsOrder);
        }else {
            commonResult=CommonResult.failed("新增失败");
        }
        return commonResult;
    }

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public CommonResult deleteOrder(@PathVariable Long id){
        CommonResult commonResult;
        int count = omsOrderService.deleteOrder(id);
        if(count == 1){
            commonResult=CommonResult.success(null,"新增成功");
        }else {
            commonResult=CommonResult.failed("新增失败");
        }
        return commonResult;
    }

    /**
     * 列举订单中的商品
     * @param id
     * @return
     */
    @RequestMapping(value = "/orderProduct",method = RequestMethod.GET)
    public CommonResult listOrderProduct(Long id){
        return CommonResult.success(omsOrderService.listProduct(id));
    }
}
