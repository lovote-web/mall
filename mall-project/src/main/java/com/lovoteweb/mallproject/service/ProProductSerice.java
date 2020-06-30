package com.lovoteweb.mallproject.service;

import com.github.pagehelper.PageHelper;
import com.lovoteweb.mallproject.mbg.mapper.ProProductMapper;
import com.lovoteweb.mallproject.mbg.model.ProProduct;
import com.lovoteweb.mallproject.mbg.model.ProProductExample;
import com.lovoteweb.mallproject.service.serviceImpl.ProProductSericeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProProductSerice implements ProProductSericeImpl {

    @Autowired
    ProProductMapper proProductMapper;

    @Override
    public List<ProProduct> listAll() {
        return proProductMapper.selectByExampleWithBLOBs(new ProProductExample());
    }

    @Override
    public int createProduct(ProProduct proProduct) {
        return proProductMapper.insertSelective(proProduct);
    }

    @Override
    public int deleteProduct(Long id) {
        return proProductMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateProduct(Long id, ProProduct proProduct) {
        proProduct.setId(id);
        return proProductMapper.updateByPrimaryKey(proProduct);
    }

    @Override
    public ProProduct getProduct(Long id) {
        return proProductMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ProProduct> listProduct(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return proProductMapper.selectByExample(new ProProductExample());
    }
}
