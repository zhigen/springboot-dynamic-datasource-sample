package com.zglu.dynamicdatasource.db0.userinfo.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author zglu
 */
@DS("zglu0")
@Service
@AllArgsConstructor
public class UserInfoDao extends ServiceImpl<UserInfoMapper, UserInfo> {

    public UserInfo add(UserInfo t) {
        super.save(t);
        return t;
    }

}
