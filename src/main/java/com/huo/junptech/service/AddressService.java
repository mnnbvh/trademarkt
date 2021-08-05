package com.huo.junptech.service;

import com.huo.junptech.domain.Address;


public interface AddressService {
    Address getByUserId(Long userId);

}
