## 小麦网部署文档

###  一、运行环境

System: Ubuntu16.04

Java: openjdk version "1.8.0_252"

Maven: Apache Maven 3.6.3

Mysql: Ver 14.14 Distrib 5.7.30

Redis server: v=3.0.6

nginx: version nginx/1.10.3 (Ubuntu)

Tomcat: apache tomcat 8.5.53

Docker: version 20.10.6

### 二、直接部署

获取 spring-boot-starter-grpc 源码

```shell
git clone git@github.com:xiaomaibos/damai-grpc.git
```

安装grpc组件到maven仓库

```shell
# damai-grpc/spring-boot-starter-grpc 目录下执行
mvn clean install
```

将公共模块安装到maven仓库

```shell
# damai-grpc/damai-parent 目录下执行
mvn clean install
# damai-grpc/damai-util 目录下执行
mvn clean install
# damai-grpc/damai-facade 目录下执行
mvn clean install
```

启动服务器：服务实现了damai-facade定义的接口

```shell
# damai-grpc/damai-server 目录下执行
mvn spring-boot:run
```

启动客户端：服务直接使用damai-facade定义的接口，远程调用服务器

```shell
# damai-grpc/damai-openclient 目录下执行
mvn spring-boot:run
# damai-grpc/damai-userclient 目录下执行
mvn spring-boot:run
# damai-grpc/damai-adminclient 目录下执行
mvn spring-boot:run
```

### 三、docker部署

构建客户端 Docker 镜像

```shell
# damai-grpc/damai-server 目录下执行
mvn clean package
docker build -t server .
```

构建服务端 Docker 镜像

```shell
# damai-grpc/damai-openclient 目录下执行
mvn clean package
docker build -t openclient .
# damai-grpc/damai-userclient 目录下执行
mvn clean package
docker build -t userclient .
# damai-grpc/damai-adminclient 目录下执行
mvn clean package
docker build -t adminclient .
```

