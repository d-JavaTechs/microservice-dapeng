package pn.eric.microservice.action

import com.isuwang.scala.dbc.Action
import com.isuwang.soa.mall.TestDB._
import wangzx.scala_commons.sql._
import com.isuwang.scala.dbc.Implicit._
import pn.eric.microservice.skill.dto.TSkill

/**
  * Created by Shadow on 2016/7/19.
  */
class SkillUpdate(tSkill: TSkill) extends Action[Unit] {
  override def inputCheck: Unit = {}

  override def action: Unit = {
    val updateJournalSql = sql"UPDATE skills SET " +
      (tSkill.name isNotEmpty).optional(sql" name=${tSkill.name},") +
      (tSkill.code isNotEmpty).optional(sql" code=${tSkill.code},") +
      (tSkill.level isNotEmpty).optional(sql" LEVEL =${tSkill.level},") +
    sql"updated_at=now() WHERE id=${tSkill.id}"
    esql(updateJournalSql)

  }

  override def postCheck: Unit = {}

  override def preCheck: Unit = {}
}
