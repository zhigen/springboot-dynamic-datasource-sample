package com.zglu.dynamicdatasource.db1.goods.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zglu.dynamicdatasource.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;

/**
 * @author zglu
 */
@Data
@EqualsAndHashCode(callSuper = true)
@FieldNameConstants
@TableName("goods")
public class Goods extends BaseEntity {
    private static final long serialVersionUID = -3865022917945885549L;

    private String name;

}
