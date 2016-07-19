package pn.eric.microservice.skill.dto;

        import java.util.Optional;

        /**
        *
        **/
        public class TSkillPageRequest{
        
            /**
            *

 查询的开始序号（序号从零开始）

            **/
            public Integer start ;
            public Integer getStart(){ return this.start; }
            public void setStart(Integer start){ this.start = start; }

          
            /**
            *

 返回记录数

            **/
            public Integer limit ;
            public Integer getLimit(){ return this.limit; }
            public void setLimit(Integer limit){ this.limit = limit; }

          
            /**
            *

 排序的字段

            **/
            public Optional<String> sortFields = Optional.empty();
            public Optional<String> getSortFields(){ return this.sortFields; }
            public void setSortFields(Optional<String> sortFields){ this.sortFields = sortFields; }

          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("start").append("\":").append(this.start).append(",");
    stringBuilder.append("\"").append("limit").append("\":").append(this.limit).append(",");
    stringBuilder.append("\"").append("sortFields").append("\":\"").append(this.sortFields.isPresent()?this.sortFields.get():null).append("\",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      