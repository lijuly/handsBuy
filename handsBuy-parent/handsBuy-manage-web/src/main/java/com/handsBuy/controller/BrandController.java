package com.handsBuy.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.handsBuy.common.response.Result;
import com.handsBuy.common.utils.PageHelperUtil;
import com.handsBuy.entity.TbBrand;
import com.handsBuy.service.BrandService;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping("/addBrand")
    public Result addBrand(@RequestBody TbBrand brand) {
        int res = brandService.addBrand(brand);
        if (res == 1) {
            return new Result(true, "增加成功");
        } else {
            return new Result(false, "增加失败");
        }

    }

    @RequestMapping("/updateBrand")
    public Result updateBrand(@RequestBody TbBrand brand) {
        int res = brandService.updateBrand(brand);
        if (res == 1) {
            return new Result(true, "修改成功");
        } else {
            return new Result(false, "修改失败");
        }
    }

    @RequestMapping("/deleteBrand")
    public Result deleteBrand(long[] ids) {
        int res = brandService.deleteBrand(ids);
        if (res != 0) {
            return new Result(true, "删除成功");
        } else {
            return new Result(false, "删除失败");
        }
    }

}
