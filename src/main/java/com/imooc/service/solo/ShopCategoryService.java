package com.imooc.service.solo;

import com.imooc.entity.bo.ShopCategory;
import com.imooc.entity.dto.Result;

import java.util.List;

public interface ShopCategoryService {
    
    Result<Boolean> addShopCategory(ShopCategory shopCategory);
    
    Result<Boolean> removeShopCategory(Integer shopCategoryId);
    
    Result<Boolean> modifyShopCategory(ShopCategory shopCategory);
    
    Result<ShopCategory> queryShopCategoryById(Integer shopCategoryId);
    
    Result<List<ShopCategory>> queryShopCategoryList(
                            ShopCategory shopCategoryCondition, 
                            int pageIndex, 
                            int pageSize);
    
}
