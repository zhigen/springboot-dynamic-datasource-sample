package com.zglu.dynamicdatasource.usergoods.controller;

import com.zglu.dynamicdatasource.api.usergoods.UserGoodsDto;
import com.zglu.dynamicdatasource.api.usergoods.UserGoodsHttpApi;
import com.zglu.dynamicdatasource.usergoods.service.UserGoodsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zglu
 */
@RestController
@AllArgsConstructor
public class UserGoodsController implements UserGoodsHttpApi {
    private final UserGoodsService service;

    @Override
    public UserGoodsDto add(UserGoodsDto dto) {
        return service.add(dto);
    }
}
