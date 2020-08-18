package com.zglu.dynamicdatasource.api.user;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户http接口
 *
 * @author zglu
 */
@RequestMapping("/user")
public interface UserHttpApi {

    /**
     * 增
     *
     * @param dto dto
     * @return dto
     */
    @PostMapping
    @ApiOperation("增（多表本地事务）")
    UserDto add(@RequestBody UserDto dto);

}
