package com.lovoteweb.mallproject.service.serviceImpl;

import com.lovoteweb.mallproject.mbg.model.OmsCartItem;

import java.util.List;

public interface OmsCartServiceImpl {

    public List<OmsCartItem> listCartAll();

    public int createCart(OmsCartItem omsCartItem);

    public int deleteCart(Long id);
}
