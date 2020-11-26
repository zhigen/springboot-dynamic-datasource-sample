package com.zglu.dynamicdatasource.db1.relate.dao;

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
@TableName("relate")
public class Relate extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private Long mainId;
    private String code;

}
