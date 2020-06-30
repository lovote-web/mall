package com.lovoteweb.mallproject.service;

import com.lovoteweb.mallproject.mbg.mapper.OmsOrderItemMapper;
import com.lovoteweb.mallproject.mbg.mapper.OmsOrderMapper;
import com.lovoteweb.mallproject.mbg.model.*;
import com.lovoteweb.mallproject.service.serviceImpl.OmsOrderServiceImpl;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OmsOrderService implements OmsOrderServiceImpl {

    @Autowired
    private OmsOrderMapper omsOrderMapper;

    @Autowired
    private OmsOrderItemMapper omsOrderItemMapper;

    @Override
    public List<OmsOrder> listAll() {
        return omsOrderMapper.selectByExample(new OmsOrderExample());
    }

    @Override
    public int createOrder(OmsOrder omsOrder) {
        return omsOrderMapper.insertSelective(omsOrder);
    }

    @Override
    public int deleteOrder(Long id) {
        return omsOrderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateOrder(Long id, OmsOrder omsOrder) {
        omsOrder.setId(id);
        return omsOrderMapper.updateByPrimaryKey(omsOrder);
    }

    @Override
    public OmsOrder getOrder(Long id) {
        return omsOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<OmsOrder> listOrder(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public List<Map<ProProduct,Integer>> listProduct(Long id) {
        OmsOrderItemExample example = new OmsOrderItemExample();
        example.createCriteria().andOrderIdEqualTo(id);
        List<OmsOrderItem> omsOrderItems = omsOrderItemMapper.selectByExample(example);
        List<Map<ProProduct,Integer>> list = (List<Map<ProProduct, Integer>>) new HashMap<Object, Object>();
        if(omsOrderItems != null){
            for (OmsOrderItem s:omsOrderItems){
                ProProduct product = new ProProduct();
                product.setName(s.getProductName());
                product.setId(s.getId());
                product.setPrice(s.getProductPrice());
                Map<ProProduct,Integer> map = new HashMap<>();
                map.put(product,s.getProductQuantity());
                list.add(map);
            }
        }
        return list;
    }
}
