package pn.eric.microservice.skill.dto;

        import java.util.Optional;

        /**
        *
        **/
        public class TSkillPageRespone{
        
            /**
            *

 查询的开始序号（序号从零开始）

            **/
            public Integer start ;
            public Integer getStart(){ return this.start; }
            public void setStart(Integer start){ this.start = start; }

          
            /**
            *

 最大返回的记录数

            **/
            public Integer limit ;
            public Integer getLimit(){ return this.limit; }
            public void setLimit(Integer limit){ this.limit = limit; }

          
            /**
            *

 结果记录数

            **/
            public Integer results ;
            public Integer getResults(){ return this.results; }
            public void setResults(Integer results){ this.results = results; }

          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("start").append("\":").append(this.start).append(",");
    stringBuilder.append("\"").append("limit").append("\":").append(this.limit).append(",");
    stringBuilder.append("\"").append("results").append("\":").append(this.results).append(",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      