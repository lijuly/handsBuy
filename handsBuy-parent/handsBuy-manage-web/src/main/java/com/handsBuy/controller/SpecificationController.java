package com.handsBuy.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.handsBuy.common.utils.PageHelperUtil;
import com.handsBuy.entity.TbSpecification;
import com.handsBuy.entity.TbSpecificationOption;
import com.handsBuy.service.SpecificationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("specification")
public class SpecificationController {

    @Reference
    SpecificationService specificationService;

    @RequestMapping("/findSpecAll")
    public List<TbSpecification> findSpecAll() {
        return specificationService.findSpecAll();
    }

    @RequestMapping("/findOptionAll")
    public List<TbSpecificationOption> findOptionAll(Long specId) {
        return specificationService.findOptAll(specId);
    }

    @RequestMapping("/findAllByPages")
    public PageHelperUtil<TbSpecification> findAllByPages(int page, int pageSize) {
        return specificationService.findAllByPages(page, pageSize);
    }
}
