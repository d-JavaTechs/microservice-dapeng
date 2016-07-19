namespace java pn.eric.microservice.skill.dto

struct TSkill{
   /**
   * 
   */
 1 :  i32 id,
   /**
   * 名称
   */
 2 :  string name,
   /**
   * 编码
   */
 3 :  string code,
   /**
   * 熟练程度,0:一般(general);1:熟悉(familiar);2:精通(proficient)
   */
 4 :  i32 level,
   /**
   * 创建时间
   */
 5 :  i64 createdAt,
   /**
   * 修改时间
   */
 6 :  i64 updatedAt,
}

struct TSkillPageRequest{
/**
	* 查询的开始序号（序号从零开始）
	**/
	1: i32 start,
	/**
	* 返回记录数
	**/
	2: i32 limit,
	/**
	* 排序的字段
	**/
	3: optional string sortFields
}

struct TSkillPageRespone{
/**
	* 查询的开始序号（序号从零开始）
	**/
	1: i32 start,
	/**
	* 最大返回的记录数
	**/
	2: i32 limit,
	/**
	* 结果记录数
	**/
	3: i32 results
}
/**
* 快塑报价查询结果
**/
struct TSkillQueryResponse {

	/**
	* 分页结果信息
	**/
	1: TSkillPageRespone pageResponse,

	/**
	* 报价信息
	**/
	2: list<TSkill> skills

}

/**
* 快塑报价查询条件
**/
struct TSkillQueryCondition {
	/**
	 * 名字 like
	 */
	1: optional string name,

	/**     in
	 * 代号
	 */
	2: optional list<string> codes,

	/**   =
	 * 级别
	 */
	3: optional string level
}