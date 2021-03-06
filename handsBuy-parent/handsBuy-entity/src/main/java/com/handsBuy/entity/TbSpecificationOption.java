package com.handsBuy.entity;

import java.io.Serializable;

public class TbSpecificationOption implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 规格项ID
     */
    private Long id;

    /**
     * 规格项名称
     */
    private String optionName;

    /**
     * 规格ID
     */
    private Long specId;

    /**
     * 排序值
     */
    private Integer orders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public Long getSpecId() {
        return specId;
    }

    public void setSpecId(Long specId) {
        this.specId = specId;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public Integer getOrders() {
        return orders;
    }


    @Override
    public String toString() {
        return "Tb_SpecificationOption[" +
                " id = " + this.id +
                " optionName = " + this.optionName +
                " specId = " + this.specId +
                " orders = " + this.orders +
                "]";
    }


}
