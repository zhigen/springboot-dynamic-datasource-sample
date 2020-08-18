package com.zglu.dynamicdatasource.config;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;

/**
 * @author zglu
 */
public class MyQueryWrapper<T> extends QueryWrapper<T> {
    private static final long serialVersionUID = 8483442306735667076L;

    @Override
    protected String columnToString(String column) {
        // 驼峰命名转换为下划线命名
        return StringUtils.camelToUnderline(column);
    }

}
