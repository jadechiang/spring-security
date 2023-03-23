# SpringBoot整合SpringSecurity简单实现登入登出从零搭建

### 资料说明 (更新日期23-3-23)

* 技术栈:SpringBoot + SpringSecurity + mybatis-plus + freemark

### 使用步骤 (更新日期23-3-23)

* 1.新建一个spring-security-login的maven项目 ，pom.xml添加基本依赖
* 2.准备你的数据库，设计表结构，要用户使用登入登出，新建用户表。
* 3.准备实体类以及 mybatis-plus相关类
* 4.application.yml配置一些基本属性
* 5.`构建真正用于SpringSecurity登录的安全用户(UserDetails)`
* 6.`核心配置，配置SpringSecurity访问策略，包括登录处理，登出处理，资源访问，密码基本加密。`
* 7.至此，已经基本将配置搭建好了配置的登录页的url 为/login，可以创建基本的Controller来验证登录了。

