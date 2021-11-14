package com.handsBuy.entity;

import java.io.Serializable;

public class SpecificationOption implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 规格项ID
     */
    private Long optionId;

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

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
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

    @Override
    public String toString() {
        return super.toString();
    }
}
