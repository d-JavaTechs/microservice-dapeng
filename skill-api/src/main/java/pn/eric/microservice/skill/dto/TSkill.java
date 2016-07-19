package pn.eric.microservice.skill.dto;

        import java.util.Optional;

        /**
        *
        **/
        public class TSkill{
        
            /**
            *



            **/
            public Integer id ;
            public Integer getId(){ return this.id; }
            public void setId(Integer id){ this.id = id; }

          
            /**
            *

 名称

            **/
            public String name ;
            public String getName(){ return this.name; }
            public void setName(String name){ this.name = name; }

          
            /**
            *

 编码

            **/
            public String code ;
            public String getCode(){ return this.code; }
            public void setCode(String code){ this.code = code; }

          
            /**
            *

 熟练程度,0:一般(general);1:熟悉(familiar);2:精通(proficient)

            **/
            public Integer level ;
            public Integer getLevel(){ return this.level; }
            public void setLevel(Integer level){ this.level = level; }

          
            /**
            *

 创建时间

            **/
            public Long createdAt ;
            public Long getCreatedAt(){ return this.createdAt; }
            public void setCreatedAt(Long createdAt){ this.createdAt = createdAt; }

          
            /**
            *

 修改时间

            **/
            public Long updatedAt ;
            public Long getUpdatedAt(){ return this.updatedAt; }
            public void setUpdatedAt(Long updatedAt){ this.updatedAt = updatedAt; }

          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("id").append("\":").append(this.id).append(",");
    stringBuilder.append("\"").append("name").append("\":\"").append(this.name).append("\",");
    stringBuilder.append("\"").append("code").append("\":\"").append(this.code).append("\",");
    stringBuilder.append("\"").append("level").append("\":").append(this.level).append(",");
    stringBuilder.append("\"").append("createdAt").append("\":").append(this.createdAt).append(",");
    stringBuilder.append("\"").append("updatedAt").append("\":").append(this.updatedAt).append(",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      