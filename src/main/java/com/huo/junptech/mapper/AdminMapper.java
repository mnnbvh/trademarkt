package com.huo.junptech.mapper;

import com.huo.junptech.domain.Admin;
import tk.mybatis.MyMapper;

public interface AdminMapper extends MyMapper<Admin> {
    Admin getByUsername(String username);
}