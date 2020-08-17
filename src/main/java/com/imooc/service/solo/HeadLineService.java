package com.imooc.service.solo;

import com.imooc.entity.bo.HeadLine;
import com.imooc.entity.dto.Result;

import java.util.List;

public interface HeadLineService {
    
    Result<Boolean> addHeadLine(HeadLine headLine);
    
    Result<Boolean> removeHeadLine(Long headLineId);
    
    Result<Boolean> modifyHeadLine(HeadLine headLine);
    
    Result<HeadLine> queryHeadLineById(Long headLineId);

    /**
     * 
     * @param headLineCondition 查询条件
     * @param pageIndex 起始页码，用于分页查询
     * @param pageSize 每页查询的记录数，用于分页查询
     * @return 返回List
     */
    Result<List<HeadLine>> queryHeadLineList(
                        HeadLine headLineCondition, 
                        int pageIndex, 
                        int pageSize);
    
}
