package com.zglu.dynamicdatasource.db1.relate.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author zglu
 */
@DS("zglu1")
@Service
public class RelateDao extends ServiceImpl<RelateMapper, Relate> {

    public void add(Relate t) {
        super.save(t);
    }

}
