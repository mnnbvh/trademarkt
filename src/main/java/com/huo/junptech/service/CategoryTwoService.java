package com.huo.junptech.service;

import com.huo.junptech.domain.CategoryTwo;

import java.util.List;

public interface CategoryTwoService {
    /**
     * 查询所有子分类
     *
     * @return
     */
    List<CategoryTwo> getAll();
}
