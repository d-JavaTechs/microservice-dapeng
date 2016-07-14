package com.isuwang.soa.mall.category.db.domain

import java.util.Date

import wangzx.scala_commons.sql.Table

/**
 *
 * @author Eric on 2015/9/29 16:03
 */
@Table(value = "categories", camelToUnderscore = true)
class Category {
   var category: String = _
   var nameEn: String = _
   var nameCn: String = _
   var description: String = _
   var applications: String = _
   var kuaisuFavor: Boolean = _
   var remark: String = _
   var createdAt: Date = _
   var updatedAt: Date = _
   var operatorId: Integer = _
}
