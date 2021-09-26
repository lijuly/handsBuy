package com.handsBuy.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.handsBuy.common.utils.PageHelperUtil;
import com.handsBuy.entity.TbBrand;
import com.handsBuy.service.BrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Reference
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<TbBrand> findAll() {
        return brandService.findAll();
    }

    @RequestMapping("/findAllByPages")
    public PageHelperUtil<TbBrand> findAllByPages(int page, int pageSize) {
        return brandService.findAllByPages(page, pageSize);
    }
}
