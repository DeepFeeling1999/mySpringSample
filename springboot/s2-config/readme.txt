配置文件加载顺序
会进行覆盖，如果四个位置都有，会按顺序加载
1：项目下的config文件夹下的配置文件
2：项目下的配置文件
3：类路径下的config文件夹下的配置文件
4：类路径下的配置文件

可以通过命令行，在打包后指定配置文件进行补充配置
#指定配置文件路径
java -jar spring-boot-02-config-0.0.1-SNAPSHOT.jar --spring.config.location=G:/application.properties
#直接指定配置
java -jar spring-boot-02-config-0.0.1-SNAPSHOT.jar --server.port=8087

打包成jar的话，只可以打包src下的配置，其他两个配置路径不符合maven路径结构不会打包


spring:
  profiles:
    active: dev2
server:
  port: 8080
---
server:
  port: 8081
spring:
  profiles: dev2
---
server:
  port: 8082
spring:
  profiles: dev3