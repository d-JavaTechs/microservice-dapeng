
        package pn.eric.microservice.skill.service;

        import com.isuwang.dapeng.core.Processor;
        import com.isuwang.dapeng.core.Service;
        import com.isuwang.dapeng.core.SoaGlobalTransactional;

        import java.util.concurrent.Future;

        /**
        * 

 技能服务

        **/
        @Service(version = "1.0.0")
        @Processor(className = "pn.eric.microservice.skill.SkillServiceCodec$Processor")
        public interface SkillService {
        
            /**
            * 

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
            
            
               pn.eric.microservice.skill.dto.TSkill addSkill( pn.eric.microservice.skill.dto.TSkill tSkill) throws com.isuwang.dapeng.core.SoaException;
              
          
            /**
            * 

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
            
            
               void deleteSkill( Integer id) throws com.isuwang.dapeng.core.SoaException;
              
          
            /**
            * 

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
            
            
               void updateSkill( pn.eric.microservice.skill.dto.TSkill tSkill) throws com.isuwang.dapeng.core.SoaException;
              
          
            /**
            * 

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
            
            
               pn.eric.microservice.skill.dto.TSkill findSkillById( Integer id) throws com.isuwang.dapeng.core.SoaException;
              
          
            /**
            * 

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
            
            
               java.util.List<pn.eric.microservice.skill.dto.TSkill> getAllSkills() throws com.isuwang.dapeng.core.SoaException;
              
          
            /**
            * 

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
            
            
               pn.eric.microservice.skill.dto.TSkillQueryResponse querySkills( pn.eric.microservice.skill.dto.TSkillPageRequest pageRequest, pn.eric.microservice.skill.dto.TSkillQueryCondition tSkillQueryCondition) throws com.isuwang.dapeng.core.SoaException;
              
          
        }
        