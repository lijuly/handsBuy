package com.handsBuy.common.utils;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 分页处理工具类
 *
 */
@Data
public class PageHelperUtil<T> implements Serializable {
    private Long total;

    private Integer pageTotal;

    private Integer page;

    private Integer pageSize;

    private List<T> list;
}
