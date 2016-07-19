package pn.eric.microservice.scheduler

import javax.annotation.Resource

/**
  *
  * @author Eric on 2016/5/5 17:22
  */
class CacheScheduler {

  @Resource
  var cacheSchedulerService: CacheSchedulerService = _

  def doUpdate() = {
    CacheHelper.skillCache = cacheSchedulerService.cacheSkill()
  }

}
