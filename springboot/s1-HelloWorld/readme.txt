只需要导入
<build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
</build>
这个插件
然后在侧边栏的maven->Lifecycle->package打包成jar包
然后可以通过命令行，跳转到对应目录
最后直接通过java -jar xxx.jar   //对应文件名，要带后缀


<parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.1.6.RELEASE</version>                    <!--2-->
        <relativePath/> <!-- lookup parent from repository -->
</parent>

它的父项目是
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-dependencies</artifactId>
    <version>2.1.6.RELEASE</version>
    <relativePath>../../spring-boot-dependencies</relativePath>
</parent>
这个会管理spring boot应用里面的所有依赖版本

可以认为是SpringBoot的版本仲裁中心
以后我们导入的依赖默认不需要写版本；
（没有在dependencies里面的依赖需要声明版本）


spring-starter-web依赖里配置了tomcat