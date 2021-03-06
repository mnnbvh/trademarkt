package com.huo.junptech.service.impl;

import com.huo.junptech.domain.Express;
import com.huo.junptech.dto.PageInfo;
import com.huo.junptech.mapper.ExpressMapper;
import com.huo.junptech.service.ExpressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ExpressServiceImpl implements ExpressService {

    @Resource
    private ExpressMapper expressMapper;

    @Override
    public PageInfo<Express> page(int draw, int start, int length, Express express) {
        Map<String,Object> params = new HashMap<>();
        params.put("start",start);
        params.put("length",length);
        params.put("Express",express);

        int count = expressMapper.selectCount(express);
        PageInfo<Express> pageInfo = new PageInfo<>();
        pageInfo.setDraw(draw);
        pageInfo.setRecordsTotal(count);
        pageInfo.setRecordsFiltered(count);
        pageInfo.setData(expressMapper.expressPage(params));

        return pageInfo;
    }

    /**
     * 保存快递信息
     * @param express
     */
    @Override
    public void save(Express express) {
        if (express.getId() == null){
            expressMapper.insert(express);
        }
        else {
            expressMapper.updateByPrimaryKey(express);
        }
    }

    @Override
    public Express getById(int id) {
        Express express = expressMapper.selectByPrimaryKey(id);
        return express;
    }

    @Override
    public void deleteOne(int id) {
        expressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Express> getAll() {
        return expressMapper.selectAll();
    }

    @Override
    public void delSelected(String[] sIds) {
        for (String sId : sIds) {
            int id = Integer.parseInt(sId);
            expressMapper.deleteByPrimaryKey(id);
        }
    }
}
