package com.handsBuy.entity;

import java.io.Serializable;

public class TbBrand implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String firstChar;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }

    public String getFirstChar() {
        return firstChar;
    }

    @Override
    public String toString() {
        return "Tb_brand["
                + "id:" + this.id
                + "  name:" + this.name
                + "  firstChar:" + this.firstChar
                + "]";
    }
}