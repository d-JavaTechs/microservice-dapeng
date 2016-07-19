package pn.eric.microservice.scheduler
import pn.eric.microservice.domains.Skill

/**
  *
  * @author Eric on 2016/5/5 17:22
  */
object CacheHelper {
  var skillCache: Map[String, Skill] = Map[String, Skill]()
  def getCountryById(id: String): Skill = {
    return skillCache(id)
  }
}
