package com.zglu.dynamicdatasource.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.zglu.dynamicdatasource.common.BaseEntity;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Optional;

/**
 * @author zglu
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    private static final String TOKEN_KEY = "token";

    @Override
    public void insertFill(MetaObject metaObject) {
        // 新增的时候自动填充
        LocalDateTime now = LocalDateTime.now();
        this.setFieldValByName(BaseEntity.Fields.createdDate, now, metaObject);
        this.setFieldValByName(BaseEntity.Fields.createdBy, getBy(), metaObject);
        this.setFieldValByName(BaseEntity.Fields.lastModifiedDate, now, metaObject);
        this.setFieldValByName(BaseEntity.Fields.lastModifiedBy, getBy(), metaObject);
        this.setFieldValByName(BaseEntity.Fields.deleted, false, metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        // 更新的时候自动填充
        this.setFieldValByName(BaseEntity.Fields.lastModifiedDate, LocalDateTime.now(), metaObject);
        this.setFieldValByName(BaseEntity.Fields.lastModifiedBy, getBy(), metaObject);
    }

    private String getBy() {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        Assert.notNull(servletRequestAttributes, "servletRequestAttributes must not be null!");
        HttpServletRequest request = servletRequestAttributes.getRequest();
        return Optional.ofNullable(request.getHeader(TOKEN_KEY)).orElse("admin");
    }

}
