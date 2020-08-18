package com.zglu.dynamicdatasource.api.usergoods;

import com.zglu.dynamicdatasource.api.goods.GoodsDto;
import com.zglu.dynamicdatasource.api.user.UserDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zglu
 */
@Data
@ApiModel("用户商品")
public class UserGoodsDto {
    @ApiModelProperty("用户")
    private UserDto userDto;
    @ApiModelProperty("商品")
    private GoodsDto goodsDto;

}
