package com.isuwang.soa.mall

import java.sql.ResultSet
import javax.sql.DataSource

import com.isuwang.scala.dbc.DB
import pn.eric.microservice.db.dbc.DbcResources
import wangzx.scala_commons.sql.SQLWithArgs

/**
  * Created by Eric on 2016/4/19.
  */
object TestDB extends DB {

  override def withDataSource(): DataSource = {
    DbcResources.testDbDataSorce
  }

  def getCount(sql: SQLWithArgs): Int = {
    eachRow(sql) { rs: ResultSet =>
      return rs.getInt(1)
    }
    0
  }
}
