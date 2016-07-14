package com.isuwang.soa.mall.category.db.action

import com.isuwang.scala.dbc.Action
import com.isuwang.scala.dbc.Implicit._
import com.isuwang.soa.category.domain.TCategory
import com.isuwang.soa.mall.MallDB._
import com.isuwang.soa.mall.category.db.domain.Category
import wangzx.scala_commons.sql._

import scala.collection.JavaConversions._

/**
  * Created by Eric on 2016/4/5.
  */
class AllCategoriesGetAction() extends Action[java.util.List[TCategory]] {

  override def inputCheck: Unit = {}

  override def action: java.util.List[TCategory] = {

    val selectSql =
      sql"""
         SELECT category,name_en,name_cn,description,applications,kuaisu_favor,remark,created_at,updated_at,operator_id
         FROM categories
       """

    rows[Category](selectSql).toThrifts[TCategory]

  }

  override def postCheck: Unit = {}

  override def preCheck: Unit = {}
}
