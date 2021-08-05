package com.huo.junptech.service.impl;

import com.huo.junptech.domain.Admin;
import com.huo.junptech.mapper.AdminMapper;
import com.huo.junptech.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Override
    public Admin login(String username,String password) {
        Admin admin = adminMapper.getByUsername(username);

        if(admin != null){
            if (admin.getPassword().equals(password)){
                return admin;
            }
        }
        return null;
    }
}
