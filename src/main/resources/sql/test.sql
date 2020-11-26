DROP TABLE IF EXISTS `zglu0`.`main`;
CREATE TABLE `zglu0`.`main`
(
    `id`                 bigint(20)  NOT NULL AUTO_INCREMENT,
    `created_date`       datetime    NOT NULL COMMENT '创建时间',
    `created_by`         varchar(64) NOT NULL COMMENT '创建人',
    `last_modified_date` datetime    NOT NULL COMMENT '最后更新时间',
    `last_modified_by`   varchar(64) NOT NULL COMMENT '最后更新人',
    `deleted`            bit(1)      NOT NULL COMMENT '逻辑删除(1:是, 0:否)',
    `name`               varchar(64) NOT NULL COMMENT '名称',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '主表';

DROP TABLE IF EXISTS `zglu0`.`expand`;
CREATE TABLE `zglu0`.`expand`
(
    `id`                 bigint(20)  NOT NULL AUTO_INCREMENT,
    `created_date`       datetime    NOT NULL COMMENT '创建时间',
    `created_by`         varchar(64) NOT NULL COMMENT '创建人',
    `last_modified_date` datetime    NOT NULL COMMENT '最后更新时间',
    `last_modified_by`   varchar(64) NOT NULL COMMENT '最后更新人',
    `deleted`            bit(1)      NOT NULL COMMENT '逻辑删除(1:是, 0:否)',
    `main_id`            bigint(20)  NOT NULL COMMENT '主表id',
    `code`               varchar(64) NOT NULL COMMENT '编码',
    PRIMARY KEY (`id`),
    UNIQUE KEY `ux_code` (`code`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '拓展表';

DROP TABLE IF EXISTS `zglu1`.`relate`;
CREATE TABLE `zglu1`.`relate`
(
    `id`                 bigint(20)  NOT NULL AUTO_INCREMENT,
    `created_date`       datetime    NOT NULL COMMENT '创建时间',
    `created_by`         varchar(64) NOT NULL COMMENT '创建人',
    `last_modified_date` datetime    NOT NULL COMMENT '最后更新时间',
    `last_modified_by`   varchar(64) NOT NULL COMMENT '最后更新人',
    `deleted`            bit(1)      NOT NULL COMMENT '逻辑删除(1:是, 0:否)',
    `main_id`            bigint(20)  NOT NULL COMMENT '主表id',
    `code`               varchar(64) NOT NULL COMMENT '编码',
    PRIMARY KEY (`id`),
    UNIQUE KEY `ux_code` (`code`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT = '涉及表';