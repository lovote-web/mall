package com.lovoteweb.mallproject.service;

import com.lovoteweb.mallproject.mbg.mapper.OmsCartItemMapper;
import com.lovoteweb.mallproject.mbg.model.OmsCartItem;
import com.lovoteweb.mallproject.mbg.model.OmsCartItemExample;
import com.lovoteweb.mallproject.service.serviceImpl.OmsCartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OmsCartService implements OmsCartServiceImpl {

    @Autowired
    private OmsCartItemMapper omsCartItemMapper;

    @Override
    public List<OmsCartItem> listCartAll() {
        return omsCartItemMapper.selectByExample(new OmsCartItemExample());
    }

    @Override
    public int createCart(OmsCartItem omsCartItem) {
        return omsCartItemMapper.insertSelective(omsCartItem);
    }

    @Override
    public int deleteCart(Long id) {
        return omsCartItemMapper.deleteByPrimaryKey(id);
    }
}
