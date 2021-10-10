package com.handsBuy.service;

import com.handsBuy.common.utils.PageHelperUtil;
import com.handsBuy.entity.TbBrand;

import java.util.List;

public interface BrandService {

    List<TbBrand> findAll();

    PageHelperUtil<TbBrand> findAllByPages(Integer page, Integer pageSize);

    int addBrand(TbBrand brand);

    int updateBrand(TbBrand brand);

    int deleteBrand(long[] ids);
}
