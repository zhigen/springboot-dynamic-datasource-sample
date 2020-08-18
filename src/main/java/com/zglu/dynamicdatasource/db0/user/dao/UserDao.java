package com.zglu.dynamicdatasource.db0.user.dao;

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
public class UserDao extends ServiceImpl<UserMapper, User> {

    public User add(User t) {
        super.save(t);
        return t;
    }

}
