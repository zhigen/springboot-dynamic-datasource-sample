package com.zglu.dynamicdatasource.db0.user.service;

import com.zglu.dynamicdatasource.api.user.UserDto;
import com.zglu.dynamicdatasource.db0.user.dao.User;
import com.zglu.dynamicdatasource.db0.userinfo.dao.UserInfo;
import lombok.Data;

/**
 * 用户业务对象
 *
 * @author zglu
 */
@Data
public class UserBo {
    private User user;
    private UserInfo userInfo;

    public static UserBo valueOf(UserDto dto) {
        UserBo bo = new UserBo();
        bo.user = new User();
        bo.user.setId(dto.getId());
        bo.user.setName(dto.getName());
        bo.userInfo = new UserInfo();
        bo.userInfo.setPhone(dto.getPhone());
        return bo;
    }

    public UserDto toDto() {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setPhone(userInfo.getPhone());
        return dto;
    }

}
