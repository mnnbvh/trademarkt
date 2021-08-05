package com.huo.junptech.mapper;

import com.huo.junptech.domain.CategoryTwo;
import tk.mybatis.MyMapper;

import java.util.List;

public interface CategoryTwoMapper extends MyMapper<CategoryTwo> {
    List<CategoryTwo> getByCategoryId(Long categoryId);
}