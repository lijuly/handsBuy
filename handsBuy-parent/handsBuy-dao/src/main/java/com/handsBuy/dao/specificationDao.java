package com.handsBuy.dao;

import com.handsBuy.entity.TbSpecification;
import com.handsBuy.entity.TbSpecificationOption;

import java.util.List;

public interface SpecificationDao {
    /**
     * 查询出所有品牌
     *
     * @return 所有品牌列表
     */
    List<TbSpecification> findSpecificationAll();

    /**
     * 查询出所有品牌
     *
     * @return 所有品牌列表
     */
    List<TbSpecificationOption> findOptionAll(Long specId);

}
