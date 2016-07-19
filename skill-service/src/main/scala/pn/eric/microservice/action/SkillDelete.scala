package pn.eric.microservice.action

import java.util
import com.isuwang.scala.dbc.Action

import com.isuwang.soa.mall.TestDB._
import wangzx.scala_commons.sql._

/**
  * Created by Shadow on 2016/7/19.
  */
class SkillDelete(id: Integer) extends Action[Unit] {
  override def inputCheck: Unit = {}

  override def action: Unit = {
    esql(sql"delete from skills where id = ${id} ")
  }

  override def postCheck: Unit = {}

  override def preCheck: Unit = {}
}
