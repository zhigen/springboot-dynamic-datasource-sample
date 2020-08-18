package com.zglu.dynamicdatasource.usergoods.service;

import com.zglu.dynamicdatasource.api.usergoods.UserGoodsDto;

/**
 * 用户商品服务
 *
 * @author zglu
 */
public interface UserGoodsService {
    /**
     * 增
     *
     * @param dto dto
     * @return bo
     */
    UserGoodsDto add(UserGoodsDto dto);

}
