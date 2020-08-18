package com.zglu.dynamicdatasource.db1.goods.controller;

import com.zglu.dynamicdatasource.api.goods.GoodsHttpApi;
import com.zglu.dynamicdatasource.api.goods.GoodsDto;
import com.zglu.dynamicdatasource.db1.goods.service.GoodsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author zglu
 */
@RestController
@AllArgsConstructor
public class GoodsController implements GoodsHttpApi {
    private final GoodsService service;

    @Override
    public GoodsDto add(GoodsDto dto) {
        return service.add(dto);
    }

}
