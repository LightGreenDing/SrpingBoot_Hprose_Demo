# SrpingBoot_Hprose_Demo项目
 SpringBoot集成JPA,Hprose，Rabbitmq，Redis！
 DemoApplication 是启动入口，application.properties是配置文件。
## com.example.demo下各包解释：
- base：父类用于继承，封装了返回格式
- config： 配置文件类 包含redis和rabbitmq的配置文件
- dao：DAO层 继承了JPA，注解配置了redis缓存
- model：实体层，对象抽象
- rabbitmq：是rabbitmq的测试
- request：请求参数的封装对象
- respone：返回数据的封装对象
- service：服务接口和服务实现类
- servlet：Hprose服务注册servlet

## 部署方式：
- 修改application.properties配置文件，指定正式环境
- 项目打包成jar包
- 然后运用命令：java -jar 打包的jar 例如（java -jar demo.jar）即可完成部署 。