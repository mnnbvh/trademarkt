package com.huo.junptech.service;

import com.huo.junptech.domain.Cart;

import java.util.List;

public interface CartService {
    List<Cart> add(Long userId, Long sellerId, Long goodsId);

    List<Cart> delete(Long userId, Long goodsId);

    List<Cart> getByUserId(Long userId);

    /**
     * 根据用户ID删除购物车
     * @param userId
     */
    void  deleteByUserId(Long userId);
}
