package com.zglu.dynamicdatasource.api.goods;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商品http接口
 *
 * @author zglu
 */
@RequestMapping("/goods")
public interface GoodsHttpApi {

    /**
     * 增
     *
     * @param dto dto
     * @return dto
     */
    @PostMapping
    @ApiOperation("增（单表）")
    GoodsDto add(@RequestBody GoodsDto dto);

}
