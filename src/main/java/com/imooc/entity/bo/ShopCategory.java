package com.imooc.entity.bo;

import lombok.Data;

import java.util.Date;

//店铺类别
@Data
public class ShopCategory {
    
    private Integer shopCategoryId;
    
    private String shopCategoryName;
    
    private String shopCategoryDesc;
    
    private String shopCategoryImg;
    
    private Integer priority;
    
    private Date createTime;
    
    private Date lastEditTime;
    
    //商品的父类别
    private ShopCategory parent;
    
}
