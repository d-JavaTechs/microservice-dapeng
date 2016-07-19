package pn.eric.microservice.action

import java.sql.Date

import com.isuwang.scala.dbc.Action
import pn.eric.microservice.domains.Skill
import wangzx.scala_commons.sql._
import com.isuwang.scala.dbc.Implicit._
import com.isuwang.soa.mall.TestDB._

import scala.collection.JavaConversions._
import org.apache.commons.lang.time.DateFormatUtils
import pn.eric.microservice.skill.dto._

/**
  * Created by Shadow on 2016/7/19.
  */
class SkillQuery(pageRequest: TSkillPageRequest, tSkillQueryCondition: TSkillQueryCondition) extends Action[TSkillQueryResponse] {
  override def inputCheck: Unit = {}

  override def action: TSkillQueryResponse = {
    val selectSQL =
      sql"""
           SELECT sk.*
           FROM skills sk
           WHERE 1=1
      """
    def sqlWhere: SQLWithArgs = {
      (tSkillQueryCondition.name.isPresent && tSkillQueryCondition.name.get().isNotEmpty()).optional(sql" and sk.name like ${tSkillQueryCondition.name.get()}") +
        (tSkillQueryCondition.codes.isPresent && tSkillQueryCondition.codes.get().size() > 0).optional(sql"and sk.code in " + buildSqlIn(tSkillQueryCondition.codes.get.toList)) +
      (tSkillQueryCondition.level.isPresent && tSkillQueryCondition.level.get().isNotEmpty()).optional(sql" and sk.level= ${tSkillQueryCondition.level.get()}}")
    }
    def formatDateStr(date: Long): String = {
      DateFormatUtils.format(new Date(date), "yyyy-MM-dd HH:mm:ss")
    }


    val sqlOrder = (pageRequest.getSortFields.isPresent && pageRequest.getSortFields != null && !pageRequest.getSortFields.get().isEmpty)
      .optional(sql" order by " + pageRequest.getSortFields.get(), sql" order by sk.updated_at desc")

    val sqlLimit = (((pageRequest.getStart isNotEmpty) || (pageRequest.getStart == 0)) && (pageRequest.getLimit isNotEmpty))
      .optional(sql" limit ${pageRequest.getStart}, ${pageRequest.getLimit}", sql" limit 0, 20")

    def getSkills(): List[Skill] = {
      rows[Skill](selectSQL + sqlWhere + sqlOrder + sqlLimit)
    }

    val response = new TSkillQueryResponse()
    val count = getCount(
      sql"""
         SELECT count(sk.id) from skills sk WHERE 1=1
         """ + sqlWhere)
    if (count > 0) {
      val skills = getSkills()
      val tSkills = skills.toThrifts[TSkill]()
      response.setSkills(tSkills)
    }else {
      response.setSkills(List())
    }

    val pageRespone: TSkillPageRespone = new TSkillPageRespone()
    pageRespone.setLimit(pageRequest.getStart)
    pageRespone.setStart(pageRequest.getLimit)
    pageRespone.setResults(count)

    response.setPageResponse(pageRespone)

    response
  }

  override def postCheck: Unit = {}

  override def preCheck: Unit = {}

}
