package com.huo.junptech.service;

import com.huo.junptech.domain.Goods;
import com.huo.junptech.dto.PageResult;

public interface FrontCateService {
    PageResult<Goods> goodsPage(int pageNum, Long categoryId);
}
