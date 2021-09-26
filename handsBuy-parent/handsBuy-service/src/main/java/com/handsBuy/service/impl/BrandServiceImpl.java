package com.handsBuy.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.handsBuy.common.utils.PageHelperUtil;
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

    @Override
    public PageHelperUtil<TbBrand> findAllByPages(Integer page, Integer pageSize) {

        // 设置起始页以及每页显示数
        PageHelper.startPage(page, pageSize);
        // 查询
        List<TbBrand> list = findAll();
        // 查询结果给pageinfo处理
        PageInfo<TbBrand> pageInfo = new PageInfo<>(list);
        // 创建结果集对象
        PageHelperUtil<TbBrand> result = new PageHelperUtil<>();
        // 将结果封装到结果集对象，当前页
        result.setPage(page);
        // 每页数
        result.setPageSize(pageInfo.getPageSize());
        // 总页数
        result.setPageTotal(pageInfo.getPages());
        // 总条数
        result.setTotal(pageInfo.getTotal());
        // 结果集
        result.setList(pageInfo.getList());

        return result;
    }
}
