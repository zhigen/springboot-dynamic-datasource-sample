package com.zglu.dynamicdatasource.api.goods;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zglu
 */
@Data
@ApiModel("商品")
public class GoodsDto {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("名称")
    private String name;

}
