package com.huo.junptech.mapper;

import com.huo.junptech.domain.ShopOrder;
import tk.mybatis.MyMapper;

import java.util.List;
import java.util.Map;

public interface ShopOrderMapper extends MyMapper<ShopOrder> {
    List<ShopOrder> orderPage(Map<String,Object> params);
}