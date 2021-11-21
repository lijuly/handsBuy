package com.handsBuy.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.handsBuy.common.utils.PageHelperUtil;
import com.handsBuy.dao.SpecificationDao;
import com.handsBuy.entity.TbSpecification;
import com.handsBuy.entity.TbSpecificationOption;
import com.handsBuy.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class SpecificationServiceImpl implements SpecificationService {

    @Autowired
    private SpecificationDao specificationDao;

    @Override
    public List<TbSpecification> findSpecAll() {
        return specificationDao.findSpecificationAll();
    }

    @Override
    public List<TbSpecificationOption> findOptAll(Long specId) {
        return specificationDao.findOptionAll(specId);
    }

    @Override
    public PageHelperUtil<TbSpecification> findAllByPages(Integer page, Integer pageSize) {
        // 设置起始页以及每页显示数
        PageHelper.startPage(page, pageSize);
        // 查询
        List<TbSpecification> list = findSpecAll();
        // 查询结果给pageinfo处理
        PageInfo<TbSpecification> pageInfo = new PageInfo<>(list);
        // 创建结果集对象
        PageHelperUtil<TbSpecification> result = new PageHelperUtil<>();
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
