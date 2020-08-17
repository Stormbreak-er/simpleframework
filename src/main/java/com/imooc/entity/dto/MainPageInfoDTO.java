package com.imooc.entity.dto;

import com.imooc.entity.bo.HeadLine;
import com.imooc.entity.bo.ShopCategory;

import java.util.List;

//用户访问首页时，需要同时获取头条 + 店铺类别，该类用于统一封装
public class MainPageInfoDTO {
    
    private List<HeadLine> headLineList;
    
    private List<ShopCategory> shopCategoryList;
    
}
