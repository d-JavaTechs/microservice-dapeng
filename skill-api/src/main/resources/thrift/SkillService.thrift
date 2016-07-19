include "SkillDomain.thrift"
namespace java pn.eric.microservice.skill.service

/**
* 技能服务
**/
service SkillService {

            	/**
            ### 概述   添加技能
            ####  业务描述
            ####  接口依赖
            ####  边界异常说明
            ####  输入
            ####  前置检查
            ####  权限检查
            ####  逻辑处理
            ####  事务处理
            ####  输出
                **/
            SkillDomain.TSkill addSkill(1:SkillDomain.TSkill tSkill),

            /**
            ### 概述   删除技能
            ####  业务描述
            ####  接口依赖
            ####  边界异常说明
            ####  输入
            ####  前置检查
            ####  权限检查
            ####  逻辑处理
            ####  事务处理
            ####  输出
                **/
            void deleteSkill(1:i32 id),
            /**
            ### 概述   修改技能
            ####  业务描述
            ####  接口依赖
            ####  边界异常说明
            ####  输入
            ####  前置检查
            ####  权限检查
            ####  逻辑处理
            ####  事务处理
            ####  输出
                **/
            void updateSkill(SkillDomain.TSkill tSkill),
            /**
            ### 概述   根据主键查找技能
            ####  业务描述
            ####  接口依赖
            ####  边界异常说明
            ####  输入
            ####  前置检查
            ####  权限检查
            ####  逻辑处理
            ####  事务处理
            ####  输出
                **/
        	SkillDomain.TSkill findSkillById(1:i32 id),
        	/**
            ### 概述   获取所有技能
            ####  业务描述
            ####  接口依赖
            ####  边界异常说明
            ####  输入
            ####  前置检查
            ####  权限检查
            ####  逻辑处理
            ####  事务处理
            ####  输出
                **/
        	list<SkillDomain.TSkill> getAllSkills(),

        	/**
            ### 概述   分页查询
            ####  业务描述
            ####  接口依赖
            ####  边界异常说明
            ####  输入
            ####  前置检查
            ####  权限检查
            ####  逻辑处理
            ####  事务处理
            ####  输出
                **/
            SkillDomain.TSkillQueryResponse querySkills(/**分页请求信息*/1: SkillDomain.TSkillPageRequest pageRequest, /**快塑报价查询条件*/2: SkillDomain.TSkillQueryCondition tSkillQueryCondition),
}