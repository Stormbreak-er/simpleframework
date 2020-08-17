package com.imooc.service.combine.impl;

import com.imooc.entity.bo.HeadLine;
import com.imooc.entity.bo.ShopCategory;
import com.imooc.entity.dto.MainPageInfoDTO;
import com.imooc.entity.dto.Result;
import com.imooc.service.combine.HeadLineShopCategoryCombineService;
import com.imooc.service.solo.HeadLineService;
import com.imooc.service.solo.ShopCategoryService;

import java.util.List;

public class HeadLineShopCategoryCombineServiceImpl implements HeadLineShopCategoryCombineService {
    
    private HeadLineService headLineService;
    
    private ShopCategoryService shopCategoryService;
    
    @Override
    public Result<MainPageInfoDTO> getMainPageInfo() {
        
        //1.获取头条列表
        HeadLine headLineCondition = new HeadLine();
        headLineCondition.setEnableStatus(1);   //获取“可用”的头条
        Result<List<HeadLine>> headLineResult = headLineService.queryHeadLineList(headLineCondition, 1, 4);

        //2.获取商铺类别列表
        ShopCategory shopCategoryCondition = new ShopCategory();    //parent为null的店铺类别，也就是根店铺类别
        Result<List<ShopCategory>> shopCategoryResult = shopCategoryService.queryShopCategoryList(shopCategoryCondition, 1, 100);

        //3.合并两者
        Result<MainPageInfoDTO> result = merge(headLineResult, shopCategoryResult);
        return result;
    }

    //合并
    private Result<MainPageInfoDTO> merge(
            Result<List<HeadLine>> headLineResult, 
            Result<List<ShopCategory>> shopCategoryResult) {
        
        return null;
    }
}
