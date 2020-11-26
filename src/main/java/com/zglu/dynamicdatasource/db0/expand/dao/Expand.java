package com.zglu.dynamicdatasource.db0.expand.dao;

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
@TableName("expand")
public class Expand extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private Long mainId;
    private String code;

}
