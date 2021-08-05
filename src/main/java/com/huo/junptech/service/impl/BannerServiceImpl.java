package com.huo.junptech.service.impl;

import com.huo.junptech.domain.Banner;
import com.huo.junptech.mapper.BannerMapper;
import com.huo.junptech.service.BannerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BannerServiceImpl  implements BannerService {
    @Resource
    private BannerMapper bannerMapper;

    @Override
    public List<Banner> showBanner() {
        List<Banner> banners = bannerMapper.selectAll();
        return banners;
    }
}
