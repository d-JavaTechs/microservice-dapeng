### Service开发

##resource 配置数据源,代码中注入datasource

##实现接口以及action

## scala dbc sql，
 隐士转换实现sql拼装

## 配置启动项
1. 当api有变动的时候，需要重新install,
2. 将目录指向service目录
3. compile com.isuwang:dapeng-maven-plugin:1.1-SNAPSHOT:run -Dsoa.apidoc.port=8091 -Dsoa.container.port=6601 -Dsoa.transactional.enable=false
    


##服务校验
站點校驗 : http://localhost:8091/index.htm,

dapeng-tool 工具校驗

cd isuwang-soa\dapeng-tools\target
java -jar dapeng-tools-1.1-SNAPSHOT-jar-with-dependencies.jar runningInfo pn.eric.microservice.skill.service.SkillService

expect Result:
pn.eric.microservice.skill.service.SkillService             1.0.0               192.168.56.1                  6601



