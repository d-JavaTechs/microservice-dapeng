package pn.eric.microservice.skill.dto;

        import java.util.Optional;

        /**
        *

 快塑报价查询结果

        **/
        public class TSkillQueryResponse{
        
            /**
            *

 分页结果信息

            **/
            public pn.eric.microservice.skill.dto.TSkillPageRespone pageResponse ;
            public pn.eric.microservice.skill.dto.TSkillPageRespone getPageResponse(){ return this.pageResponse; }
            public void setPageResponse(pn.eric.microservice.skill.dto.TSkillPageRespone pageResponse){ this.pageResponse = pageResponse; }

          
            /**
            *

 报价信息

            **/
            public java.util.List<pn.eric.microservice.skill.dto.TSkill> skills ;
            public java.util.List<pn.eric.microservice.skill.dto.TSkill> getSkills(){ return this.skills; }
            public void setSkills(java.util.List<pn.eric.microservice.skill.dto.TSkill> skills){ this.skills = skills; }

          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("pageResponse").append("\":").append(this.pageResponse.toString()).append(",");
    stringBuilder.append("\"").append("skills").append("\":").append(this.skills).append(",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      