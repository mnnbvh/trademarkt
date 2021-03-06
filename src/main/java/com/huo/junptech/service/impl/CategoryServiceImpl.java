package com.huo.junptech.service.impl;

import com.huo.junptech.domain.Category;
import com.huo.junptech.dto.PageInfo;
import com.huo.junptech.mapper.CategoryMapper;
import com.huo.junptech.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public Category showCategory(Long id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<Category> page(int draw, int start, int length, Category category) {
        Map<String,Object> params = new HashMap<>();
        params.put("start",start);
        params.put("length",length);
        params.put("Category",category);

        int count = categoryMapper.selectCount(category);
        PageInfo<Category> pageInfo = new PageInfo<>();
        pageInfo.setDraw(draw);
        pageInfo.setRecordsTotal(count);
        pageInfo.setRecordsFiltered(count);
        pageInfo.setData(categoryMapper.categoryPage(params));

        return pageInfo;
    }

    @Override
    public void save(Category category) {
        if(category.getId() == null){
            categoryMapper.insert(category);
        }
        else {
            categoryMapper.updateByPrimaryKey(category);
        }
    }

    @Override
    public Category getById(Long id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteOne(int id) {
        categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Category> categoryList() {
        List<Category> categories = categoryMapper.selectAll();
        return categories;
    }

    @Override
    public void deleteSelected(String[] sIds) {
        for (String sId : sIds) {
            int i = Integer.parseInt(sId);
            categoryMapper.deleteByPrimaryKey(i);
        }
    }
}
