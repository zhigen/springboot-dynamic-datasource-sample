package com.zglu.dynamicdatasource.common;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldNameConstants;

import java.time.LocalDateTime;

/**
 * @author zglu
 */
@Data
@EqualsAndHashCode(callSuper = true)
@FieldNameConstants
public class BaseEntity extends Model<BaseEntity> {
    private static final long serialVersionUID = -1542811750940034006L;

    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdDate;

    @TableField(fill = FieldFill.INSERT)
    private Long createdBy;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime lastModifiedDate;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long lastModifiedBy;

    @TableField(fill = FieldFill.INSERT)
    @TableLogic(value = "0", delval = "1")
    private Boolean deleted;

}
