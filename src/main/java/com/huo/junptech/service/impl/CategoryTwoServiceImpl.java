package com.huo.junptech.service.impl;

import com.huo.junptech.domain.CategoryTwo;
import com.huo.junptech.mapper.CategoryTwoMapper;
import com.huo.junptech.service.CategoryTwoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryTwoServiceImpl implements CategoryTwoService {
    @Resource
    private CategoryTwoMapper categoryTwoMapper;

    @Override
    public List<CategoryTwo> getAll() {
        return categoryTwoMapper.selectAll();
    }
}
