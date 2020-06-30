package com.lovoteweb.mallproject.service.serviceImpl;

import com.lovoteweb.mallproject.mbg.model.ProBrand;

import java.util.List;
//品牌
public interface ProBrandServiceImpl {

    List<ProBrand> listAllBrand();

    int createBrand(ProBrand proBrand);

    int updateBrand(Long id, ProBrand proBrand);

    int deleteBrand(Long id);

    List<ProBrand> listBrand(int pageNum,int pageSize);

    ProBrand getBrand(Long id);
}
