package com.zglu.dynamicdatasource.db0.main.dao;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author zglu
 */
@Service
public class MainDao extends ServiceImpl<MainMapper, Main> {

    public void add(Main t) {
        super.save(t);
    }

}
