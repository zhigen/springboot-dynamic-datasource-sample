package com.zglu.dynamicdatasource.db0.main.service;

import com.zglu.dynamicdatasource.db0.expand.dao.Expand;
import com.zglu.dynamicdatasource.db0.expand.dao.ExpandDao;
import com.zglu.dynamicdatasource.db0.main.dao.Main;
import com.zglu.dynamicdatasource.db0.main.dao.MainDao;
import com.zglu.dynamicdatasource.db1.relate.dao.Relate;
import com.zglu.dynamicdatasource.db1.relate.dao.RelateDao;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户服务实现
 *
 * @author zglu
 */
@Service
@AllArgsConstructor
public class UserService {
    private final MainDao mainDao;
    private final ExpandDao expandDao;
    private final RelateDao relateDao;

    @Transactional(rollbackFor = Exception.class)
    public Long transactional(String name, String code) {
        Main main = new Main();
        main.setName(name);
        mainDao.add(main);
        Expand expand = new Expand();
        expand.setMainId(main.getId());
        expand.setCode(code);
        expandDao.add(expand);
        return main.getId();
    }

    @GlobalTransactional
    public Long globalTransactional(String name, String code) {
        Main main = new Main();
        main.setName(name);
        mainDao.add(main);
        Relate relate = new Relate();
        relate.setMainId(main.getId());
        relate.setCode(code);
        relateDao.add(relate);
        return main.getId();
    }

}
