package com.lovoteweb.mallproject.service;

import com.github.pagehelper.PageHelper;
import com.lovoteweb.mallproject.mbg.mapper.ProBrandMapper;
import com.lovoteweb.mallproject.mbg.model.ProBrand;
import com.lovoteweb.mallproject.mbg.model.ProBrandExample;
import com.lovoteweb.mallproject.service.serviceImpl.ProBrandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProBrandService implements ProBrandServiceImpl {

    @Autowired
    ProBrandMapper proBrandMapper;

    @Override
    public List<ProBrand> listAllBrand() {
        return proBrandMapper.selectByExampleWithBLOBs(new ProBrandExample());
    }

    @Override
    public int createBrand(ProBrand proBrand) {
        return proBrandMapper.insertSelective(proBrand);
    }

    @Override
    public int updateBrand(Long id, ProBrand proBrand) {
        proBrand.setId(id);
        return proBrandMapper.updateByPrimaryKeySelective(proBrand);
    }

    @Override
    public int deleteBrand(Long id) {
        return proBrandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<ProBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return proBrandMapper.selectByExample(new ProBrandExample());
    }

    @Override
    public ProBrand getBrand(Long id) {
        return proBrandMapper.selectByPrimaryKey(id);
    }
}
