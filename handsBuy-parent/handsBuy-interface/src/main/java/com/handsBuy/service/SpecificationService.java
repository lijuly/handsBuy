package com.handsBuy.service;

import com.handsBuy.common.utils.PageHelperUtil;
import com.handsBuy.entity.TbSpecification;
import com.handsBuy.entity.TbSpecificationOption;

import java.util.List;

public interface SpecificationService {

    List<TbSpecification> findSpecAll();

    List<TbSpecificationOption> findOptAll(Long id);

    PageHelperUtil<TbSpecification> findAllByPages(Integer page, Integer pageSize);
}
