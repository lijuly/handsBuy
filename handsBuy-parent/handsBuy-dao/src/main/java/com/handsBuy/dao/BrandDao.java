package com.handsBuy.dao;

import com.handsBuy.entity.TbBrand;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BrandDao {
    /**
     * 查询出所有品牌
     *
     * @return 所有品牌列表
     */
    //@Select("select * from tb_brand")
    List<TbBrand> findAll();

    /**
     * 添加品牌
     *
     * @param brand 品牌
     * @return
     */
    //@Insert("insert into tb_brand(name, firstChar) values(#{name}, #{firstChar})")
    int addBrand(TbBrand brand);

    /**
     * 修改品牌列表
     * @param brand 品牌
     * @return
     */
    //@Update("update tb_brand set name=#{name}, firstChar=#{firstChar} where id=#{id}")
    int updateBrand(TbBrand brand);

    /**
     * 批量删除品牌
     * @param ids
     */
    /*@Delete("<script>" +
                "delete from tb_brand where id in " +
                "<foreach collection='array' item='id' open='(' separator=',' close=')'>"+
                    "#{id}" +
                "</foreach>" +
            "</script>")
    int deleteBrand(long[] ids);*/

    /**
     * 批量删除品牌
     * @param ids
     */
    int deleteBrandByIds(List<Long> ids);
}
