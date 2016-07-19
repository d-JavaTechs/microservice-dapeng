package pn.eric.microservice.skill.enums;

        public enum SkillLevel implements com.isuwang.org.apache.thrift.TEnum{
        
            /**
            *

一般

            **/
            GENERAL(0),
          
            /**
            *

熟悉

            **/
            FAMILIAR(1),
          
            /**
            *

精通

            **/
            PROFICIENT(2);
          

        private final int value;

        private SkillLevel(int value){
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }

        public static SkillLevel findByValue(int value){
            switch(value){
            
                 case 0:
                    return GENERAL;
               
                 case 1:
                    return FAMILIAR;
               
                 case 2:
                    return PROFICIENT;
               
               default:
                   return null;
            }
        }
        }
      