package com.zglu.dynamicdatasource.db0.expand.dao;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author zglu
 */
@Service
public class ExpandDao extends ServiceImpl<ExpandMapper, Expand> {

    public void add(Expand t) {
        super.save(t);
    }

}
