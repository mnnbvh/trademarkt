package com.huo.junptech.service;

import com.huo.junptech.domain.Express;
import com.huo.junptech.dto.PageInfo;

import java.util.List;

public interface ExpressService {
    PageInfo<Express> page(int draw, int start, int length, Express express);

    void save(Express express);

    Express getById(int id);

    void deleteOne(int id);

    List<Express> getAll();

    void delSelected(String[] sIds);
}
