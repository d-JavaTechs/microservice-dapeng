package pn.eric.microservice.skill;

        import com.isuwang.dapeng.core.*;
        import com.isuwang.org.apache.thrift.*;
        import com.isuwang.dapeng.remoting.BaseServiceClient;
        import java.util.concurrent.CompletableFuture;
        import java.util.concurrent.Future;
        import pn.eric.microservice.skill.SkillServiceCodec.*;

        public class SkillServiceClient extends BaseServiceClient{

        public SkillServiceClient() {
          super("pn.eric.microservice.skill.service.SkillService", "1.0.0");
        }

        @Override
        protected boolean isSoaTransactionalProcess(){
          return false;
        }

        
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
            
                public pn.eric.microservice.skill.dto.TSkill addSkill(pn.eric.microservice.skill.dto.TSkill tSkill) throws SoaException{
                  initContext("addSkill");

            try {
               addSkill_args addSkill_args = new addSkill_args();
            addSkill_args.setTSkill(tSkill);
              

            addSkill_result response = sendBase(addSkill_args, new addSkill_result(), new AddSkill_argsSerializer(), new AddSkill_resultSerializer());

               
                    
                          return response.getSuccess();
                        
                  
            }catch (SoaException e){
                throw e;
            } catch (TException e){
                throw new SoaException(e);
            }finally {
              destoryContext();
            }
            }
              
          
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
            
                public void deleteSkill(Integer id) throws SoaException{
                  initContext("deleteSkill");

            try {
               deleteSkill_args deleteSkill_args = new deleteSkill_args();
            deleteSkill_args.setId(id);
              

            deleteSkill_result response = sendBase(deleteSkill_args, new deleteSkill_result(), new DeleteSkill_argsSerializer(), new DeleteSkill_resultSerializer());

               
                    
                  
            }catch (SoaException e){
                throw e;
            } catch (TException e){
                throw new SoaException(e);
            }finally {
              destoryContext();
            }
            }
              
          
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
            
                public void updateSkill(pn.eric.microservice.skill.dto.TSkill tSkill) throws SoaException{
                  initContext("updateSkill");

            try {
               updateSkill_args updateSkill_args = new updateSkill_args();
            updateSkill_args.setTSkill(tSkill);
              

            updateSkill_result response = sendBase(updateSkill_args, new updateSkill_result(), new UpdateSkill_argsSerializer(), new UpdateSkill_resultSerializer());

               
                    
                  
            }catch (SoaException e){
                throw e;
            } catch (TException e){
                throw new SoaException(e);
            }finally {
              destoryContext();
            }
            }
              
          
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
            
                public pn.eric.microservice.skill.dto.TSkill findSkillById(Integer id) throws SoaException{
                  initContext("findSkillById");

            try {
               findSkillById_args findSkillById_args = new findSkillById_args();
            findSkillById_args.setId(id);
              

            findSkillById_result response = sendBase(findSkillById_args, new findSkillById_result(), new FindSkillById_argsSerializer(), new FindSkillById_resultSerializer());

               
                    
                          return response.getSuccess();
                        
                  
            }catch (SoaException e){
                throw e;
            } catch (TException e){
                throw new SoaException(e);
            }finally {
              destoryContext();
            }
            }
              
          
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
            
                public java.util.List<pn.eric.microservice.skill.dto.TSkill> getAllSkills() throws SoaException{
                  initContext("getAllSkills");

            try {
               getAllSkills_args getAllSkills_args = new getAllSkills_args();
            

            getAllSkills_result response = sendBase(getAllSkills_args, new getAllSkills_result(), new GetAllSkills_argsSerializer(), new GetAllSkills_resultSerializer());

               
                    
                          return response.getSuccess();
                        
                  
            }catch (SoaException e){
                throw e;
            } catch (TException e){
                throw new SoaException(e);
            }finally {
              destoryContext();
            }
            }
              
          
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
            
                public pn.eric.microservice.skill.dto.TSkillQueryResponse querySkills(pn.eric.microservice.skill.dto.TSkillPageRequest pageRequest,pn.eric.microservice.skill.dto.TSkillQueryCondition tSkillQueryCondition) throws SoaException{
                  initContext("querySkills");

            try {
               querySkills_args querySkills_args = new querySkills_args();
            querySkills_args.setPageRequest(pageRequest);
              querySkills_args.setTSkillQueryCondition(tSkillQueryCondition);
              

            querySkills_result response = sendBase(querySkills_args, new querySkills_result(), new QuerySkills_argsSerializer(), new QuerySkills_resultSerializer());

               
                    
                          return response.getSuccess();
                        
                  
            }catch (SoaException e){
                throw e;
            } catch (TException e){
                throw new SoaException(e);
            }finally {
              destoryContext();
            }
            }
              
          

        /**
        * getServiceMetadata
        **/
        public String getServiceMetadata() throws SoaException {
          initContext("getServiceMetadata");
          try {
            getServiceMetadata_args getServiceMetadata_args = new getServiceMetadata_args();
            getServiceMetadata_result response = sendBase(getServiceMetadata_args, new getServiceMetadata_result(), new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer());
            return response.getSuccess();
          }catch (SoaException e){
            throw e;
          } catch (TException e){
            throw new SoaException(e);
          } finally {
            destoryContext();
          }
        }

        }
      