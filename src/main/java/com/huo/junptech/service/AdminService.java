package com.huo.junptech.service;

import com.huo.junptech.domain.Admin;

public interface AdminService {
    Admin login(String username,String password);
}
