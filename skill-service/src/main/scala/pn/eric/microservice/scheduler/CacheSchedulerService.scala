package pn.eric.microservice.scheduler

import com.isuwang.soa.mall.TestDB._
import org.springframework.transaction.annotation.Transactional
import pn.eric.microservice.domains.Skill
import wangzx.scala_commons.sql._

/**
  *
  * @author Eric  2016/5/5 18:21
  */
@Transactional
class CacheSchedulerService {

  def cacheSkill(): Map[String, Skill] = {
    val selectSql =
      sql"""
           select * from skills
       """
    rows[Skill](selectSql).map(element => (element.code.trim, element)).toMap
  }


}