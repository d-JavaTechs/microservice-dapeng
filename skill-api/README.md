### Domain生成

##下载 isuwang-soa
git clone https://github.com/isuwang/isuwang-soa-hello.git

## 安装soa项目到本地maven仓库
mvn clean install

## 执行skills.sql,反射数据库生成对应的结构体
1. cd isuwang-soa\dapeng-tools\target
2. java -jar dapeng-tools-1.1-SNAPSHOT-jar-with-dependencies.jar reverse:conf
3. 生成示例配置文件:  ~/Desktop/dapeng-reverse-conf/reverse.conf
4. 配置reverse.conf
   4.1 数据库信息
   4.2 包名
   4.3 数据库名
   4.4 反射模式： 全库或者单表
5. java -jar dapeng-tools-1.1-SNAPSHOT-jar-with-dependencies.jar reverse:all ~/Desktop/dapeng-reverse-conf/reverse.conf
   在桌面会生成  dto,Po,enum 文件夹
6. 将*Domain, *Enum拷贝到resource中，并且定义好 *service.thrift
7. 将PO/*.scala拷贝到service项目,并且新建包名
8.  cd isuwang-soa\isuwang-soa\dapeng-code-generator
   java -jar dapeng-code-generator-1.1-SNAPSHOT-jar-with-dependencies.jar -gen java -out ~\Desktop\dapeng-api -in microservice-dapeng\skill-api\src\main\resources\thrift
9.  cd microservice-dapeng\skill-api.    
     mvn clean install






