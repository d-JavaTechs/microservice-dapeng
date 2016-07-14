include "province_domain.thrift"
namespace java com.isuwang.soa.province.service

/**
* 省份服务
**/
service ProvinceService {

    /**
	 * 获取所有的分类
	 */
	list<province_domain.TProvince> getAllProvinces(),
}