package com.handsBuy.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.handsBuy.dao.BrandDao;
import com.handsBuy.entity.TbBrand;
import com.handsBuy.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandDao brandDao;

    @Override
    public List<TbBrand> findAll() {

        return brandDao.findAll();
    }
}
