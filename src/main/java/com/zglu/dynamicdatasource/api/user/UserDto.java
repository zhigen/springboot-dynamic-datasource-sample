package com.zglu.dynamicdatasource.api.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zglu
 */
@Data
@ApiModel("用户")
public class UserDto {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("手机")
    private String phone;

}
