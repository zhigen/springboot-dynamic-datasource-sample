package com.zglu.dynamicdatasource.usergoods.service;

import com.zglu.dynamicdatasource.api.goods.GoodsDto;
import com.zglu.dynamicdatasource.api.user.UserDto;
import com.zglu.dynamicdatasource.api.usergoods.UserGoodsDto;
import com.zglu.dynamicdatasource.db0.user.service.UserBo;
import com.zglu.dynamicdatasource.db0.user.service.UserService;
import com.zglu.dynamicdatasource.db1.goods.service.GoodsService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zglu
 */
@Service
public class UserGoodsServiceImpl implements UserGoodsService {
    @Autowired
    private UserService userService;
    @Autowired
    private GoodsService goodsService;

    @Override
    @GlobalTransactional
    public UserGoodsDto add(UserGoodsDto dto) {
        GoodsDto goodsDto = dto.getGoodsDto();
        goodsDto = goodsService.add(goodsDto);

        UserDto userDto = dto.getUserDto();
        UserBo userBo = userService.add(UserBo.valueOf(userDto));
        userDto = userBo.toDto();

        dto.setGoodsDto(goodsDto);
        dto.setUserDto(userDto);
        return dto;
    }

}
