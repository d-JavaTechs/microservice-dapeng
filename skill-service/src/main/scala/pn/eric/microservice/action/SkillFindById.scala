package pn.eric.microservice.action

import com.isuwang.scala.dbc.Action
import pn.eric.microservice.domains.Skill
import wangzx.scala_commons.sql._
import com.isuwang.soa.mall.TestDB._
import com.isuwang.scala.dbc.Implicit._
import pn.eric.microservice.skill.dto.TSkill

/**
  * Created by Shadow on 2016/7/19.
  */
class SkillFindById(id: Integer) extends Action[TSkill] {
  override def inputCheck: Unit = {}

  override def action: TSkill = {
    row[Skill](sql"SELECT * FROM skills WHERE id=${id}").get.toThrift[TSkill]
  }

  override def postCheck: Unit = {}

  override def preCheck: Unit = {}
}
