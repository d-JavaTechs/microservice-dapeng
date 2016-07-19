package pn.eric.microservice.action

import java.util

import com.isuwang.scala.dbc.Action
import pn.eric.microservice.domains.Skill
import wangzx.scala_commons.sql._
import com.isuwang.scala.dbc.Implicit._
import com.isuwang.soa.mall.TestDB._
import pn.eric.microservice.skill.dto.TSkill

import scala.collection.JavaConversions._

/**
  * Created by Eric on 2016/4/5.
  */
class SkillsGetAll() extends Action[java.util.List[TSkill]] {
  override def inputCheck: Unit = {}

  override def action: util.List[TSkill] = {
    val selectSql =
      sql"""
         SELECT *
         FROM skills
       """

    rows[Skill](selectSql).toThrifts[TSkill]
  }

  override def postCheck: Unit = {}

  override def preCheck: Unit = {}
}
