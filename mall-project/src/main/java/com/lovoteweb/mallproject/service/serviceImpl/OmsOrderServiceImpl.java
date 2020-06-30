package com.lovoteweb.mallproject.service.serviceImpl;

import com.lovoteweb.mallproject.mbg.model.OmsOrder;
import com.lovoteweb.mallproject.mbg.model.OmsOrderItem;
import com.lovoteweb.mallproject.mbg.model.ProProduct;

import java.util.List;
import java.util.Map;

public interface OmsOrderServiceImpl {

    public List<OmsOrder> listAll();

    public int createOrder(OmsOrder omsOrder);

    public int deleteOrder(Long id);

    public int updateOrder(Long id,OmsOrder omsOrder);

    public OmsOrder getOrder(Long id);

    public List<OmsOrder> listOrder(int pageNum,int pageSize);

    /**
     * 将指定订单id的商品列出
     * @param id
     * @return
     */
    public List<Map<ProProduct,Integer>> listProduct(Long id);
}
