简体中文 | [English](/README.en-US.md)

# springboot-dynamic-datasource-sample
springboot框架集成dynamic-datasource，测试动态数据源、多数据源事务。分布式事务使用中间件seata的at事务模式实现。

![logo](/static/logo.png "logo tip")

[![badge](https://img.shields.io/badge/license-WTFPL-blue)](http://www.wtfpl.net/)

# 目录
* [1. 项目背景](#1)
* [2. 使用](#2)
* [3. 相关项目](#3)
* [4. 维护者](#4)
* [5. 贡献](#5)
* [6. 开源协议](#6)

<a id="1"></a>
## 1. 项目背景
记录并分享个人在开发过程中，使用到的技术的用法与示例。

<a id="2"></a>
## 2. 使用
    2.1. $ docker run --name mysql -d -p 3306:3306 -v /e/data/docker/mysql:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=123456 mysql:8
    2.2. 确认2.1挂载目录后执行，开启数据库服务。或修改application.properties配置，指向可用数据库服务
    2.3. 数据库增加zglu0、zglu1库，执行test.sql、db_undo_log.sql
    2.4. $ docker run --name seata -p 8091:8091 -e SEATA_CONFIG_NAME=file:/root/seata-config/registry -v /e/data/docker/seata/conf:/root/seata-config seataio/seata-server:1.3.0
    2.5. 确认2.4挂载目录内已有registry.conf与file.conf配置文件后执行，配置文件可从seata安装包内获取，项目内也有提供文件
    2.6. 运行项目，打开接口文档(http://localhost:8083/swagger-ui.html)，根据文档测试使用
    2.7. 修改application.properties配置文件throw-exception=true，测试异常情况下，本地事务及分布式事务回滚结果

<a id="3"></a>
## 3. 相关项目
[specification-document](https://github.com/zhigen/specification-document)
[springboot-sample](https://github.com/zhigen/springboot-sample)
[springboot-mybatis-sample](https://github.com/zhigen/springboot-mybatis-sample)
[springboot-jpa-sample](https://github.com/zhigen/springboot-jpa-sample)

<a id="4"></a>
## 4. 维护者
[@zhigen](https://github.com/zhigen)

<a id="5"></a>
## 5. 贡献
[Pull Request](https://github.com/zhigen/springboot-dynamic-datasource-sample/pulls)

<a id="6"></a>
## 6. 许可证
[WTFPL](/LICENSE) © Lu Zhigen