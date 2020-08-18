package com.zglu.dynamicdatasource.api.usergoods;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户商品接口
 *
 * @author zglu
 */
@RequestMapping("/user-goods")
public interface UserGoodsHttpApi {

    /**
     * 增
     *
     * @param dto dto
     * @return dto
     */
    @PostMapping
    @ApiOperation("增（多表跨库事务）")
    UserGoodsDto add(@RequestBody UserGoodsDto dto);

}
