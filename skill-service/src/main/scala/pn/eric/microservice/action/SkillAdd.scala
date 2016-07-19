package pn.eric.microservice.action

import com.isuwang.scala.dbc.Action
import com.isuwang.soa.mall.TestDB._
import wangzx.scala_commons.sql._
import com.isuwang.scala.dbc.Implicit._
import pn.eric.microservice.skill.dto.TSkill

import scala.collection.JavaConversions._
/**
  * Created by Shadow on 2016/7/19.
  */
class SkillAdd(tSkill: TSkill) extends Action[TSkill] {
  override def inputCheck: Unit = {}

  override def action: TSkill = {
    val sqlInsert =
      sql"""
          INSERT INTO skills SET
            name = ${tSkill.name},
            code = ${tSkill.code},
            level = ${tSkill.level},
            created_at = now(),
            updated_at = now()
            """
    tSkill.id=esqlWithGenerateKey(sqlInsert)(null)
    tSkill
  }

  override def postCheck: Unit = {}

  override def preCheck: Unit = {}
}
