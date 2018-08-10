## Happymmall

一个作为练习的由SSM框架搭建的入门电商项目，只包含后端部分。目前，此项目有以下几个模块：
* 用户模块
* 分类模块
* 商品模块
* 购物车模块
* 订单模块
* 收货地址
* 支付模块

### 项目环境
* 语言： Java
* IDE：Intellij IDEA
* 后台框架：SSM（ springmvc+spring+mybatis）
* 服务器：nginx 1.14 + tomcat 8.5
* 数据库：MySQL 8.0
* 测试工具：Restlet Client

### 准备
* 创建项目
* 如为windows环境，则在C:\Windows\System32\drivers\etc下找到hosts文件，加入 `127.0.0.1 image.happymmall.com` `127.0.0.1 www.happymmall.com`两行代码配置虚拟域名
* 配置nginx.conf 监听80端口使www.happymmall.com转发到tomcat服务器端口，image.happymmall.com到ftp服务器主目录下
* 创建数据库 *mmall_learning*，导入 *mmall.sql*
* 在resources下修改 *mmall.properties*、*datasource.properties* 两处配置文件，并在蚂蚁金服开放平台 [当面付文档](https://docs.open.alipay.com/194/) 下载相关 [Demo](https://docs.open.alipay.com/194/105201/)，拷贝 *zfbinfo.properties* 并根据文档介绍修改相关配置

### 联系方式
* [水木今山的CSDN](https://blog.csdn.net/qq_38283262)
* [水木今山的Github](https://github.com/cenjieHo)
* [水木今山的Gmail](mailto:cenjie.ho@gmail.com)
* [水木今山的Weibo](https://weibo.com/5777495883/profile?topnav=1&wvr=6)