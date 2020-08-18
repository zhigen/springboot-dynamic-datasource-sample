package com.zglu.dynamicdatasource.db0.user.service;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.zglu.dynamicdatasource.db0.user.dao.UserDao;
import com.zglu.dynamicdatasource.db0.userinfo.dao.UserInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户服务实现
 *
 * @author zglu
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;
    @Autowired
    private UserInfoDao infoDao;
    @Value("${throw-exception}")
    private boolean throwException;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public UserBo add(UserBo bo) {
        dao.add(bo.getUser());
        bo.getUserInfo().setUserId(bo.getUser().getId());
        infoDao.add(bo.getUserInfo());
        Assert.isFalse(throwException, "事务回滚");
        return bo;
    }

}
