package com.zglu.dynamicdatasource.db0.user.controller;

import com.zglu.dynamicdatasource.api.user.UserHttpApi;
import com.zglu.dynamicdatasource.api.user.UserDto;
import com.zglu.dynamicdatasource.db0.user.service.UserBo;
import com.zglu.dynamicdatasource.db0.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author zglu
 */
@RestController
@AllArgsConstructor
public class UserController implements UserHttpApi {
    private final UserService userService;

    @Override
    public UserDto add(UserDto dto) {
        UserBo bo = UserBo.valueOf(dto);
        bo = userService.add(bo);
        return bo.toDto();
    }

}
