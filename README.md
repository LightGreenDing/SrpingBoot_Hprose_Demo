# SrpingBoot_Hprose_Demo
SpringBoot集成JPA,Hprose，Rabbitmq，Redis！
DemoApplication 是启动入口，application.properties是配置文件。

com.example.demo下各包解释：
base：下是父类 用来服务继承，里边封装了返回格式
config： 下是配置文件类 包含redis和rabbitmq的配置文件
dao：下是DAO层 继承了JPA，注解配置了redis缓存
model：下是实体层，对象抽象
rabbitmq：是rabbitmq的测试
request：是请求参数的封装对象
respone：返回数据的封装对象
service：服务接口和服务实现类
servlet：Hprose服务注册servlet







