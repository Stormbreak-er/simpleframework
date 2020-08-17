package com.imooc.service.combine;

import com.imooc.entity.dto.MainPageInfoDTO;
import com.imooc.entity.dto.Result;

public interface HeadLineShopCategoryCombineService {
    
    //进入首页时，获取所有需要展示的内容
    Result<MainPageInfoDTO> getMainPageInfo();
    
}
