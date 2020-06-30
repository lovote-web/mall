package com.lovoteweb.mallproject.service.serviceImpl;

import com.lovoteweb.mallproject.mbg.model.ProProductCategory;

import java.util.List;
//分类
public interface ProProductCategoryServiceImpl {

    List<ProProductCategory> listAllProProductCategory();

    int createCategory(ProProductCategory proProductCategory);

    int updateCategory(Long id,ProProductCategory proProductCategory);

    int deleteCategory(Long id);

    List<ProProductCategory> listCategory(int PageNum,int PageSize);

    ProProductCategory getCategory(Long id);

}
