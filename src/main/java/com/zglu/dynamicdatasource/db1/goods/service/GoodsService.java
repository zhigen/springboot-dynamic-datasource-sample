package com.zglu.dynamicdatasource.db1.goods.service;

import com.zglu.dynamicdatasource.api.goods.GoodsDto;

/**
 * 商品服务
 *
 * @author zglu
 */
public interface GoodsService {
    /**
     * 增
     *
     * @param dto dto
     * @return bo
     */
    GoodsDto add(GoodsDto dto);

}
