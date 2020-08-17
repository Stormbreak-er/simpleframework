package com.imooc.entity.bo;

import lombok.Data;

import java.util.Date;

//头条（广告位）
@Data
public class HeadLine {
    
    private Long lineId;
    
    private String lineName;
    
    //头条链接，点击头条会进入该链接
    private String lineLink;
    
    //头条图片
    private String lineImg;
    
    //优先级，越大越在前显示
    private Integer priority;
    
    //0：不可用     1：可用
    private Integer enableStatus;
    
    private Date createTime;
    
    private Date lastEditTime;
    
}
