1.新建maven项目
2.加入maven依赖
    1）spring依赖
    2）mybatis依赖
    3）MySQL依赖
    4）spring的事务依赖
    5）mybatis和spring集成的依赖，mybatis官方提供的，用来在spring项目中
    创建mybatis的SqlSessionFactory，dao对象
3.创建实体类
4.创建dao接口和mapper对象
5.创建mybatis主配置文件
6.创建Service接口和实现类，属性是dao
7.创建Spring配置文件，声明mybatis的对象交给spring创建
    1）数据源 DateSource
    2）SqlSessionFactory
    3) dao对象
    4）声明自定义的service