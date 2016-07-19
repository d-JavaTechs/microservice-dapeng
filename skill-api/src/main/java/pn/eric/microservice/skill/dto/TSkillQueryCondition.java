package pn.eric.microservice.skill.dto;

        import java.util.Optional;

        /**
        *

 快塑报价查询条件

        **/
        public class TSkillQueryCondition{
        
            /**
            *

 名字 like

            **/
            public Optional<String> name = Optional.empty();
            public Optional<String> getName(){ return this.name; }
            public void setName(Optional<String> name){ this.name = name; }

          
            /**
            *     in
 代号

            **/
            public Optional<java.util.List<String>> codes = Optional.empty();
            public Optional<java.util.List<String>> getCodes(){ return this.codes; }
            public void setCodes(Optional<java.util.List<String>> codes){ this.codes = codes; }

          
            /**
            *   =
 级别

            **/
            public Optional<String> level = Optional.empty();
            public Optional<String> getLevel(){ return this.level; }
            public void setLevel(Optional<String> level){ this.level = level; }

          

        public String toString(){
          StringBuilder stringBuilder = new StringBuilder("{");
          stringBuilder.append("\"").append("name").append("\":\"").append(this.name.isPresent()?this.name.get():null).append("\",");
    stringBuilder.append("\"").append("codes").append("\":").append(this.codes.isPresent()?this.codes.get():null).append(",");
    stringBuilder.append("\"").append("level").append("\":\"").append(this.level.isPresent()?this.level.get():null).append("\",");
    
          stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
          stringBuilder.append("}");

          return stringBuilder.toString();
        }
      }
      