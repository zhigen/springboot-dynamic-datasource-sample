package com.zglu.dynamicdatasource.db0.user.dao;

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
@TableName("user")
public class User extends BaseEntity {
    private static final long serialVersionUID = -3865022917945885549L;

    private String name;

}
