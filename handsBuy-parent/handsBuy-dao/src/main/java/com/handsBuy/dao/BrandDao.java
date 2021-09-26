package com.handsBuy.dao;

import com.handsBuy.entity.TbBrand;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BrandDao {
    /**
     * 查询出所有账户
     *
     * @return 所有账户信息
     */
    @Select("select * from tb_brand")
    List<TbBrand> findAll();
}
