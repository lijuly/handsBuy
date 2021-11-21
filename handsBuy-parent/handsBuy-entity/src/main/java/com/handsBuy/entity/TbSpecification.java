package com.handsBuy.entity;

import java.io.Serializable;
import java.util.List;

public class TbSpecification  implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String specName;

    /**
     * 规格集合
     * */
    private List<TbSpecificationOption> specificationOptionList;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public List<TbSpecificationOption> getSpecificationOptionList() {
        return specificationOptionList;
    }

    public void setSpecificationOptionList(List<TbSpecificationOption> specificationOptionList) {
        this.specificationOptionList = specificationOptionList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (TbSpecificationOption option : specificationOptionList) {
            sb.append(option.toString());
            sb.append(", ");
        }
        return "Tb_Specification[" +
                " id = " + this.id +
                " specName = " + this.specName +
                " SpecificationOptionList [" +
                sb.toString() +
                "]";
    }
}
