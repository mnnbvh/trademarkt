package com.huo.junptech.vo;

import com.huo.junptech.domain.Category;
import com.huo.junptech.domain.Goods;

import java.io.Serializable;

public class GoodsVO implements Serializable {

    /**
     * 分类ID
     */
    private String categoryId;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 商品
     */
    private Goods goods;

    /**
     * 分类
     */
    private Category category;
}
