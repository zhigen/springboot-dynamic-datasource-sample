package com.zglu.dynamicdatasource.db1.goods.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author zglu
 */
@DS("zglu1")
@Service
@AllArgsConstructor
public class GoodsDao extends ServiceImpl<GoodsMapper, Goods> {

    public Goods add(Goods t){
        super.save(t);
        return t;
    }

}
