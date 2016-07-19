package pn.eric.microservice.domains

import wangzx.scala_commons.sql._

/**
  * @author dapeng-tool
  */@Table(value = "skills", camelToUnderscore = true)
class Skill extends java.io.Serializable {
  /**
    *
    */
  @Id(auto=true)
  var id : Int =_

  /**
    * 名称
    */
  var name : String =_

  /**
    * 编码
    */
  var code : String =_

  /**
    * 熟练程度,0:一般(general);1:熟悉(familiar);2:精通(proficient)
    */
  var level : Int =_

  /**
    * 创建时间
    */
  var createdAt : java.sql.Timestamp =_

  /**
    * 修改时间
    */
  var updatedAt : java.sql.Timestamp =_

}