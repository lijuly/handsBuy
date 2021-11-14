package com.handsBuy.dao;

import com.handsBuy.entity.TbBrand;
import com.handsBuy.entity.TbSpecification;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface specificationDao {
    /**
     * 查询出所有品牌
     *
     * @return 所有品牌列表
     */
    List<TbSpecification> findAll();

}
