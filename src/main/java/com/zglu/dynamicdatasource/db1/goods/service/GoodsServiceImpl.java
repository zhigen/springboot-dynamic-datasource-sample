package com.zglu.dynamicdatasource.db1.goods.service;

import com.zglu.dynamicdatasource.api.goods.GoodsDto;
import com.zglu.dynamicdatasource.db1.goods.dao.Goods;
import com.zglu.dynamicdatasource.db1.goods.dao.GoodsDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author zglu
 */
@Service
@AllArgsConstructor
public class GoodsServiceImpl implements GoodsService {
    private final GoodsDao dao;

    private Goods toEntity(GoodsDto dto) {
        Goods t = new Goods();
        t.setId(dto.getId());
        t.setName(dto.getName());
        return t;
    }

    private GoodsDto toDto(Goods t) {
        GoodsDto dto = new GoodsDto();
        dto.setId(t.getId());
        dto.setName(t.getName());
        return dto;
    }

    @Override
    public GoodsDto add(GoodsDto dto) {
        Goods t = dao.add(toEntity(dto));
        return toDto(t);
    }

}
