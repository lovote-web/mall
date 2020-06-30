package com.lovoteweb.mallproject.service;

import com.github.pagehelper.PageHelper;
import com.lovoteweb.mallproject.mbg.mapper.ProProductCategoryMapper;
import com.lovoteweb.mallproject.mbg.model.ProProductCategory;
import com.lovoteweb.mallproject.mbg.model.ProProductCategoryExample;
import com.lovoteweb.mallproject.service.serviceImpl.ProProductCategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProProductCategoryService implements ProProductCategoryServiceImpl {

    @Autowired
    ProProductCategoryMapper proProductCategoryMapper;

    @Override
    public List<ProProductCategory> listAllProProductCategory() {
        return proProductCategoryMapper.selectByExampleWithBLOBs(new ProProductCategoryExample());
    }

    @Override
    public int createCategory(ProProductCategory proProductCategory) {
        return proProductCategoryMapper.insertSelective(proProductCategory);
    }

    @Override
    public int updateCategory(Long id, ProProductCategory proProductCategory) {
        proProductCategory.setId(id);
        return proProductCategoryMapper.updateByPrimaryKeySelective(proProductCategory);
    }

    @Override
    public int deleteCategory(Long id) {
        return proProductCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<ProProductCategory> listCategory(int PageNum, int PageSize) {
        PageHelper.startPage(PageNum,PageSize);
        return proProductCategoryMapper.selectByExample(new ProProductCategoryExample());
    }

    @Override
    public ProProductCategory getCategory(Long id) {
        return proProductCategoryMapper.selectByPrimaryKey(id);
    }
}
