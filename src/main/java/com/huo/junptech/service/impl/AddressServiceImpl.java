package com.huo.junptech.service.impl;

import com.huo.junptech.domain.Address;
import com.huo.junptech.mapper.AddressMapper;
import com.huo.junptech.service.AddressService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

@Service
public class AddressServiceImpl implements AddressService {
    @Resource
    private AddressMapper addressMapper;

    /**
     * 通过用户ID查找地址
     * @param userId
     * @return
     */
    @Override
    public Address getByUserId(Long userId) {
        Example example = new Example(Address.class);
        example.createCriteria().andEqualTo("userId", userId);
        return addressMapper.selectOneByExample(example);
    }
}
