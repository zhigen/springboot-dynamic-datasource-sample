package com.zglu.dynamicdatasource.db0.main.dao;

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
@TableName("main")
public class Main extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private String name;

}
