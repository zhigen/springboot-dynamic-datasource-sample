package com.zglu.dynamicdatasource.db0.userinfo.dao;

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
@TableName("user_info")
public class UserInfo extends BaseEntity {
    private static final long serialVersionUID = 1593470001497184768L;

    private Long userId;
    private String phone;

}
