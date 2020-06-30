package com.lovoteweb.mallproject.service.serviceImpl;

import com.lovoteweb.mallproject.mbg.model.ProProduct;

import java.util.List;

public interface ProProductSericeImpl {
    public List<ProProduct> listAll();

    public int createProduct(ProProduct proProduct);

    public int deleteProduct(Long id);

    public int updateProduct(Long id,ProProduct proProduct);

    public ProProduct getProduct(Long id);

    public List<ProProduct> listProduct(Integer pageNum,Integer pageSize);
}
