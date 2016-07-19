package pn.eric.microservice.skill;

        import com.isuwang.dapeng.core.*;
        import com.isuwang.org.apache.thrift.*;
        import com.isuwang.org.apache.thrift.protocol.*;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;

        import java.util.Optional;
        import java.util.concurrent.CompletableFuture;
        import java.util.concurrent.Future;

        public class SkillServiceCodec {
        public static class TSkillSerializer implements TBeanSerializer<pn.eric.microservice.skill.dto.TSkill>{
            
      @Override
      public void read(pn.eric.microservice.skill.dto.TSkill bean, TProtocol iprot) throws TException{

        com.isuwang.org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();

        while(true){
          schemeField = iprot.readFieldBegin();
          if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

          switch(schemeField.id){
          
              case 1:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
                       bean.setId(iprot.readI32());
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 2:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                       bean.setName(iprot.readString());
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 3:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                       bean.setCode(iprot.readString());
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 4:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
                       bean.setLevel(iprot.readI32());
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 5:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I64){
                       bean.setCreatedAt(iprot.readI64());
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 6:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I64){
                       bean.setUpdatedAt(iprot.readI64());
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
            
                default:
                  com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        validate(bean);
      }
    
      @Override
      public void write(pn.eric.microservice.skill.dto.TSkill bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("TSkill"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("id", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 1));
            oprot.writeI32(bean.getId());
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("name", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 2));
            oprot.writeString(bean.getName());
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("code", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 3));
            oprot.writeString(bean.getCode());
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("level", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 4));
            oprot.writeI32(bean.getLevel());
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("createdAt", com.isuwang.org.apache.thrift.protocol.TType.I64, (short) 5));
            oprot.writeI64(bean.getCreatedAt());
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("updatedAt", com.isuwang.org.apache.thrift.protocol.TType.I64, (short) 6));
            oprot.writeI64(bean.getUpdatedAt());
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    public void validate(pn.eric.microservice.skill.dto.TSkill bean) throws TException{
      
              if(bean.getId() == null)
              throw new SoaException(SoaBaseCode.NotNull, "id字段不允许为空");
            
              if(bean.getName() == null)
              throw new SoaException(SoaBaseCode.NotNull, "name字段不允许为空");
            
              if(bean.getCode() == null)
              throw new SoaException(SoaBaseCode.NotNull, "code字段不允许为空");
            
              if(bean.getLevel() == null)
              throw new SoaException(SoaBaseCode.NotNull, "level字段不允许为空");
            
              if(bean.getCreatedAt() == null)
              throw new SoaException(SoaBaseCode.NotNull, "createdAt字段不允许为空");
            
              if(bean.getUpdatedAt() == null)
              throw new SoaException(SoaBaseCode.NotNull, "updatedAt字段不允许为空");
            
    }
    
            @Override
            public String toString(pn.eric.microservice.skill.dto.TSkill bean) { return bean == null ? "null" : bean.toString(); }
          }
          public static class TSkillPageRequestSerializer implements TBeanSerializer<pn.eric.microservice.skill.dto.TSkillPageRequest>{
            
      @Override
      public void read(pn.eric.microservice.skill.dto.TSkillPageRequest bean, TProtocol iprot) throws TException{

        com.isuwang.org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();

        while(true){
          schemeField = iprot.readFieldBegin();
          if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

          switch(schemeField.id){
          
              case 1:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
                       bean.setStart(iprot.readI32());
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 2:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
                       bean.setLimit(iprot.readI32());
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 3:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                       bean.setSortFields(Optional.of(iprot.readString()));
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
            
                default:
                  com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        validate(bean);
      }
    
      @Override
      public void write(pn.eric.microservice.skill.dto.TSkillPageRequest bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("TSkillPageRequest"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("start", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 1));
            oprot.writeI32(bean.getStart());
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("limit", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 2));
            oprot.writeI32(bean.getLimit());
            oprot.writeFieldEnd();
          if(bean.getSortFields().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("sortFields", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 3));
              oprot.writeString(bean.getSortFields().get());
              oprot.writeFieldEnd();
            }
            
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    public void validate(pn.eric.microservice.skill.dto.TSkillPageRequest bean) throws TException{
      
              if(bean.getStart() == null)
              throw new SoaException(SoaBaseCode.NotNull, "start字段不允许为空");
            
              if(bean.getLimit() == null)
              throw new SoaException(SoaBaseCode.NotNull, "limit字段不允许为空");
            
    }
    
            @Override
            public String toString(pn.eric.microservice.skill.dto.TSkillPageRequest bean) { return bean == null ? "null" : bean.toString(); }
          }
          public static class TSkillPageResponeSerializer implements TBeanSerializer<pn.eric.microservice.skill.dto.TSkillPageRespone>{
            
      @Override
      public void read(pn.eric.microservice.skill.dto.TSkillPageRespone bean, TProtocol iprot) throws TException{

        com.isuwang.org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();

        while(true){
          schemeField = iprot.readFieldBegin();
          if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

          switch(schemeField.id){
          
              case 1:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
                       bean.setStart(iprot.readI32());
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 2:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
                       bean.setLimit(iprot.readI32());
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 3:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
                       bean.setResults(iprot.readI32());
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
            
                default:
                  com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        validate(bean);
      }
    
      @Override
      public void write(pn.eric.microservice.skill.dto.TSkillPageRespone bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("TSkillPageRespone"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("start", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 1));
            oprot.writeI32(bean.getStart());
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("limit", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 2));
            oprot.writeI32(bean.getLimit());
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("results", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 3));
            oprot.writeI32(bean.getResults());
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    public void validate(pn.eric.microservice.skill.dto.TSkillPageRespone bean) throws TException{
      
              if(bean.getStart() == null)
              throw new SoaException(SoaBaseCode.NotNull, "start字段不允许为空");
            
              if(bean.getLimit() == null)
              throw new SoaException(SoaBaseCode.NotNull, "limit字段不允许为空");
            
              if(bean.getResults() == null)
              throw new SoaException(SoaBaseCode.NotNull, "results字段不允许为空");
            
    }
    
            @Override
            public String toString(pn.eric.microservice.skill.dto.TSkillPageRespone bean) { return bean == null ? "null" : bean.toString(); }
          }
          public static class TSkillQueryResponseSerializer implements TBeanSerializer<pn.eric.microservice.skill.dto.TSkillQueryResponse>{
            
      @Override
      public void read(pn.eric.microservice.skill.dto.TSkillQueryResponse bean, TProtocol iprot) throws TException{

        com.isuwang.org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();

        while(true){
          schemeField = iprot.readFieldBegin();
          if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

          switch(schemeField.id){
          
              case 1:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRUCT){
                    
            bean.setPageResponse(new pn.eric.microservice.skill.dto.TSkillPageRespone());
            new TSkillPageResponeSerializer().read(bean.getPageResponse(), iprot);
          
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 2:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.LIST){
                    {
            com.isuwang.org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
            bean.setSkills(new java.util.ArrayList<>(_list0.size));
            for(int _i2 = 0; _i2 < _list0.size; ++ _i2){
              pn.eric.microservice.skill.dto.TSkill _elem1 = new pn.eric.microservice.skill.dto.TSkill();
                  new TSkillSerializer().read(_elem1, iprot);
              bean.getSkills().add(_elem1);
            }
            iprot.readListEnd();
            }
          
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
            
                default:
                  com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        validate(bean);
      }
    
      @Override
      public void write(pn.eric.microservice.skill.dto.TSkillQueryResponse bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("TSkillQueryResponse"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("pageResponse", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, (short) 1));
              new TSkillPageResponeSerializer().write(bean.getPageResponse(), oprot);
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("skills", com.isuwang.org.apache.thrift.protocol.TType.LIST, (short) 2));
            oprot.writeListBegin(new com.isuwang.org.apache.thrift.protocol.TList(com.isuwang.org.apache.thrift.protocol.TType.STRUCT, bean.getSkills().size()));
              for(pn.eric.microservice.skill.dto.TSkill item : bean.getSkills()){
               new TSkillSerializer().write(item, oprot);
              }
              oprot.writeListEnd();
        
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    public void validate(pn.eric.microservice.skill.dto.TSkillQueryResponse bean) throws TException{
      
              if(bean.getPageResponse() == null)
              throw new SoaException(SoaBaseCode.NotNull, "pageResponse字段不允许为空");
            
                if(bean.getPageResponse() != null)
                new TSkillPageResponeSerializer().validate(bean.getPageResponse());
              
              if(bean.getSkills() == null)
              throw new SoaException(SoaBaseCode.NotNull, "skills字段不允许为空");
            
    }
    
            @Override
            public String toString(pn.eric.microservice.skill.dto.TSkillQueryResponse bean) { return bean == null ? "null" : bean.toString(); }
          }
          public static class TSkillQueryConditionSerializer implements TBeanSerializer<pn.eric.microservice.skill.dto.TSkillQueryCondition>{
            
      @Override
      public void read(pn.eric.microservice.skill.dto.TSkillQueryCondition bean, TProtocol iprot) throws TException{

        com.isuwang.org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();

        while(true){
          schemeField = iprot.readFieldBegin();
          if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

          switch(schemeField.id){
          
              case 1:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                       bean.setName(Optional.of(iprot.readString()));
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 2:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.LIST){
                    {
            com.isuwang.org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
            bean.setCodes(Optional.of(new java.util.ArrayList<>(_list0.size)));
            for(int _i2 = 0; _i2 < _list0.size; ++ _i2){
               String _elem1 = iprot.readString();
              bean.getCodes().get().add(_elem1);
            }
            iprot.readListEnd();
            }
          
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 3:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING){
                       bean.setLevel(Optional.of(iprot.readString()));
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
            
                default:
                  com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        validate(bean);
      }
    
      @Override
      public void write(pn.eric.microservice.skill.dto.TSkillQueryCondition bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("TSkillQueryCondition"));

      if(bean.getName().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("name", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 1));
              oprot.writeString(bean.getName().get());
              oprot.writeFieldEnd();
            }
            if(bean.getCodes().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("codes", com.isuwang.org.apache.thrift.protocol.TType.LIST, (short) 2));
              oprot.writeListBegin(new com.isuwang.org.apache.thrift.protocol.TList(com.isuwang.org.apache.thrift.protocol.TType.STRING, bean.getCodes().get().size()));
              for(String item : bean.getCodes().get()){
          oprot.writeString(item);
              }
              oprot.writeListEnd();
        
              oprot.writeFieldEnd();
            }
            if(bean.getLevel().isPresent()){
              oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("level", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 3));
              oprot.writeString(bean.getLevel().get());
              oprot.writeFieldEnd();
            }
            
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    public void validate(pn.eric.microservice.skill.dto.TSkillQueryCondition bean) throws TException{
      
    }
    
            @Override
            public String toString(pn.eric.microservice.skill.dto.TSkillQueryCondition bean) { return bean == null ? "null" : bean.toString(); }
          }
          

        
            public static class addSkill_args {
            
               private pn.eric.microservice.skill.dto.TSkill tSkill;

               public pn.eric.microservice.skill.dto.TSkill getTSkill(){
                  return this.tSkill;
               }
               public void setTSkill(pn.eric.microservice.skill.dto.TSkill tSkill){
                  this.tSkill = tSkill;
               }
             

            @Override
            public String toString(){
              StringBuilder stringBuilder = new StringBuilder("{");
                
      stringBuilder.append("\"").append("tSkill").append("\":").append(this.tSkill == null ? "null" : this.tSkill.toString()).append(",");
    
              if(stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
              stringBuilder.append("}");

              return stringBuilder.toString();
            }

          }


            public static class addSkill_result {

            
                  private pn.eric.microservice.skill.dto.TSkill success;
                  public pn.eric.microservice.skill.dto.TSkill getSuccess(){
                    return success;
                  }

                  public void setSuccess(pn.eric.microservice.skill.dto.TSkill success){
                    this.success = success;
                  }


                  @Override
                  public String toString(){
                  StringBuilder stringBuilder = new StringBuilder("{");
                    
      stringBuilder.append("\"").append("success").append("\":").append(this.success == null ? "null" : this.success.toString()).append(",");
    
                    stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                    stringBuilder.append("}");

                  return stringBuilder.toString();
                }

                
            }

            public static class AddSkill_argsSerializer implements TBeanSerializer<addSkill_args>{
            
      @Override
      public void read(addSkill_args bean, TProtocol iprot) throws TException{

        com.isuwang.org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();

        while(true){
          schemeField = iprot.readFieldBegin();
          if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

          switch(schemeField.id){
          
              case 1:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRUCT){
                    
            bean.setTSkill(new pn.eric.microservice.skill.dto.TSkill());
            new TSkillSerializer().read(bean.getTSkill(), iprot);
          
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
            
                default:
                  com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        validate(bean);
      }
    
            
      @Override
      public void write(addSkill_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("addSkill_args"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("tSkill", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, (short) 1));
              new TSkillSerializer().write(bean.getTSkill(), oprot);
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
    public void validate(addSkill_args bean) throws TException{
      
              if(bean.getTSkill() == null)
              throw new SoaException(SoaBaseCode.NotNull, "tSkill字段不允许为空");
            
                if(bean.getTSkill() != null)
                new TSkillSerializer().validate(bean.getTSkill());
              
    }
    

            @Override
            public String toString(addSkill_args bean) { return bean == null ? "null" : bean.toString(); }

            }

            public static class AddSkill_resultSerializer implements TBeanSerializer<addSkill_result>{
              @Override
              public void read(addSkill_result bean, TProtocol iprot) throws TException{

                com.isuwang.org.apache.thrift.protocol.TField schemeField;
                iprot.readStructBegin();

                while(true){
                  schemeField = iprot.readFieldBegin();
                  if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

                  switch(schemeField.id){
                    case 0:  //SUCCESS
                       if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRUCT){
                       
            bean.setSuccess(new pn.eric.microservice.skill.dto.TSkill());
            new TSkillSerializer().read(bean.getSuccess(), iprot);
          
                       }else{
                          com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    /*
                    case 1: //ERROR
                        bean.setSoaException(new SoaException());
                        new SoaExceptionSerializer().read(bean.getSoaException(), iprot);
                        break A;
                    */
                    default:
                      com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  iprot.readFieldEnd();
                }
                iprot.readStructEnd();

                validate(bean);
              }
            
      @Override
      public void write(addSkill_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("addSkill_result"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("success", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, (short) 0));
              new TSkillSerializer().write(bean.getSuccess(), oprot);
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
    public void validate(addSkill_result bean) throws TException{
      
              if(bean.getSuccess() == null)
              throw new SoaException(SoaBaseCode.NotNull, "success字段不允许为空");
            
                if(bean.getSuccess() != null)
                new TSkillSerializer().validate(bean.getSuccess());
              
    }
    

            @Override
            public String toString(addSkill_result bean) { return bean == null ? "null" : bean.toString(); }
          }

            public static class addSkill<I extends pn.eric.microservice.skill.service.SkillService> extends SoaProcessFunction<I, addSkill_args, addSkill_result, AddSkill_argsSerializer,  AddSkill_resultSerializer>{
               public addSkill(){
                   super("addSkill", new AddSkill_argsSerializer(),  new AddSkill_resultSerializer());
               }
            
               @Override
               public addSkill_result getResult(I iface, addSkill_args args) throws TException{
                   addSkill_result result = new addSkill_result();
              
                      result.success = iface.addSkill(args.tSkill);
                    
                   return result;
               }
              

               @Override
               public addSkill_args getEmptyArgsInstance(){
                  return new addSkill_args();
               }

               @Override
               protected boolean isOneway(){
                  return false;
               }
            }
          
            public static class deleteSkill_args {
            
               private Integer id;

               public Integer getId(){
                  return this.id;
               }
               public void setId(Integer id){
                  this.id = id;
               }
             

            @Override
            public String toString(){
              StringBuilder stringBuilder = new StringBuilder("{");
                
      stringBuilder.append("\"").append("id").append("\":").append(id).append(",");
    
              if(stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
              stringBuilder.append("}");

              return stringBuilder.toString();
            }

          }


            public static class deleteSkill_result {

            
                  @Override
                  public String toString(){
                      return "{}";
                   }
                
            }

            public static class DeleteSkill_argsSerializer implements TBeanSerializer<deleteSkill_args>{
            
      @Override
      public void read(deleteSkill_args bean, TProtocol iprot) throws TException{

        com.isuwang.org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();

        while(true){
          schemeField = iprot.readFieldBegin();
          if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

          switch(schemeField.id){
          
              case 1:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
                       bean.setId(iprot.readI32());
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
            
                default:
                  com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        validate(bean);
      }
    
            
      @Override
      public void write(deleteSkill_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("deleteSkill_args"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("id", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 1));
            oprot.writeI32(bean.getId());
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
    public void validate(deleteSkill_args bean) throws TException{
      
              if(bean.getId() == null)
              throw new SoaException(SoaBaseCode.NotNull, "id字段不允许为空");
            
    }
    

            @Override
            public String toString(deleteSkill_args bean) { return bean == null ? "null" : bean.toString(); }

            }

            public static class DeleteSkill_resultSerializer implements TBeanSerializer<deleteSkill_result>{
              @Override
              public void read(deleteSkill_result bean, TProtocol iprot) throws TException{

                com.isuwang.org.apache.thrift.protocol.TField schemeField;
                iprot.readStructBegin();

                while(true){
                  schemeField = iprot.readFieldBegin();
                  if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

                  switch(schemeField.id){
                    case 0:  //SUCCESS
                       if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.VOID){
                       com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                       }else{
                          com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    /*
                    case 1: //ERROR
                        bean.setSoaException(new SoaException());
                        new SoaExceptionSerializer().read(bean.getSoaException(), iprot);
                        break A;
                    */
                    default:
                      com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  iprot.readFieldEnd();
                }
                iprot.readStructEnd();

                validate(bean);
              }
            
      @Override
      public void write(deleteSkill_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("deleteSkill_result"));

      
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
    public void validate(deleteSkill_result bean) throws TException{
      
    }
    

            @Override
            public String toString(deleteSkill_result bean) { return bean == null ? "null" : bean.toString(); }
          }

            public static class deleteSkill<I extends pn.eric.microservice.skill.service.SkillService> extends SoaProcessFunction<I, deleteSkill_args, deleteSkill_result, DeleteSkill_argsSerializer,  DeleteSkill_resultSerializer>{
               public deleteSkill(){
                   super("deleteSkill", new DeleteSkill_argsSerializer(),  new DeleteSkill_resultSerializer());
               }
            
               @Override
               public deleteSkill_result getResult(I iface, deleteSkill_args args) throws TException{
                   deleteSkill_result result = new deleteSkill_result();
              
                      iface.deleteSkill(args.id);
                    
                   return result;
               }
              

               @Override
               public deleteSkill_args getEmptyArgsInstance(){
                  return new deleteSkill_args();
               }

               @Override
               protected boolean isOneway(){
                  return false;
               }
            }
          
            public static class updateSkill_args {
            
               private pn.eric.microservice.skill.dto.TSkill tSkill;

               public pn.eric.microservice.skill.dto.TSkill getTSkill(){
                  return this.tSkill;
               }
               public void setTSkill(pn.eric.microservice.skill.dto.TSkill tSkill){
                  this.tSkill = tSkill;
               }
             

            @Override
            public String toString(){
              StringBuilder stringBuilder = new StringBuilder("{");
                
      stringBuilder.append("\"").append("tSkill").append("\":").append(this.tSkill == null ? "null" : this.tSkill.toString()).append(",");
    
              if(stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
              stringBuilder.append("}");

              return stringBuilder.toString();
            }

          }


            public static class updateSkill_result {

            
                  @Override
                  public String toString(){
                      return "{}";
                   }
                
            }

            public static class UpdateSkill_argsSerializer implements TBeanSerializer<updateSkill_args>{
            
      @Override
      public void read(updateSkill_args bean, TProtocol iprot) throws TException{

        com.isuwang.org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();

        while(true){
          schemeField = iprot.readFieldBegin();
          if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

          switch(schemeField.id){
          
              case 1:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRUCT){
                    
            bean.setTSkill(new pn.eric.microservice.skill.dto.TSkill());
            new TSkillSerializer().read(bean.getTSkill(), iprot);
          
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
            
                default:
                  com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        validate(bean);
      }
    
            
      @Override
      public void write(updateSkill_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("updateSkill_args"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("tSkill", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, (short) 1));
              new TSkillSerializer().write(bean.getTSkill(), oprot);
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
    public void validate(updateSkill_args bean) throws TException{
      
              if(bean.getTSkill() == null)
              throw new SoaException(SoaBaseCode.NotNull, "tSkill字段不允许为空");
            
                if(bean.getTSkill() != null)
                new TSkillSerializer().validate(bean.getTSkill());
              
    }
    

            @Override
            public String toString(updateSkill_args bean) { return bean == null ? "null" : bean.toString(); }

            }

            public static class UpdateSkill_resultSerializer implements TBeanSerializer<updateSkill_result>{
              @Override
              public void read(updateSkill_result bean, TProtocol iprot) throws TException{

                com.isuwang.org.apache.thrift.protocol.TField schemeField;
                iprot.readStructBegin();

                while(true){
                  schemeField = iprot.readFieldBegin();
                  if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

                  switch(schemeField.id){
                    case 0:  //SUCCESS
                       if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.VOID){
                       com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                       }else{
                          com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    /*
                    case 1: //ERROR
                        bean.setSoaException(new SoaException());
                        new SoaExceptionSerializer().read(bean.getSoaException(), iprot);
                        break A;
                    */
                    default:
                      com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  iprot.readFieldEnd();
                }
                iprot.readStructEnd();

                validate(bean);
              }
            
      @Override
      public void write(updateSkill_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("updateSkill_result"));

      
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
    public void validate(updateSkill_result bean) throws TException{
      
    }
    

            @Override
            public String toString(updateSkill_result bean) { return bean == null ? "null" : bean.toString(); }
          }

            public static class updateSkill<I extends pn.eric.microservice.skill.service.SkillService> extends SoaProcessFunction<I, updateSkill_args, updateSkill_result, UpdateSkill_argsSerializer,  UpdateSkill_resultSerializer>{
               public updateSkill(){
                   super("updateSkill", new UpdateSkill_argsSerializer(),  new UpdateSkill_resultSerializer());
               }
            
               @Override
               public updateSkill_result getResult(I iface, updateSkill_args args) throws TException{
                   updateSkill_result result = new updateSkill_result();
              
                      iface.updateSkill(args.tSkill);
                    
                   return result;
               }
              

               @Override
               public updateSkill_args getEmptyArgsInstance(){
                  return new updateSkill_args();
               }

               @Override
               protected boolean isOneway(){
                  return false;
               }
            }
          
            public static class findSkillById_args {
            
               private Integer id;

               public Integer getId(){
                  return this.id;
               }
               public void setId(Integer id){
                  this.id = id;
               }
             

            @Override
            public String toString(){
              StringBuilder stringBuilder = new StringBuilder("{");
                
      stringBuilder.append("\"").append("id").append("\":").append(id).append(",");
    
              if(stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
              stringBuilder.append("}");

              return stringBuilder.toString();
            }

          }


            public static class findSkillById_result {

            
                  private pn.eric.microservice.skill.dto.TSkill success;
                  public pn.eric.microservice.skill.dto.TSkill getSuccess(){
                    return success;
                  }

                  public void setSuccess(pn.eric.microservice.skill.dto.TSkill success){
                    this.success = success;
                  }


                  @Override
                  public String toString(){
                  StringBuilder stringBuilder = new StringBuilder("{");
                    
      stringBuilder.append("\"").append("success").append("\":").append(this.success == null ? "null" : this.success.toString()).append(",");
    
                    stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                    stringBuilder.append("}");

                  return stringBuilder.toString();
                }

                
            }

            public static class FindSkillById_argsSerializer implements TBeanSerializer<findSkillById_args>{
            
      @Override
      public void read(findSkillById_args bean, TProtocol iprot) throws TException{

        com.isuwang.org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();

        while(true){
          schemeField = iprot.readFieldBegin();
          if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

          switch(schemeField.id){
          
              case 1:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.I32){
                       bean.setId(iprot.readI32());
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
            
                default:
                  com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        validate(bean);
      }
    
            
      @Override
      public void write(findSkillById_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("findSkillById_args"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("id", com.isuwang.org.apache.thrift.protocol.TType.I32, (short) 1));
            oprot.writeI32(bean.getId());
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
    public void validate(findSkillById_args bean) throws TException{
      
              if(bean.getId() == null)
              throw new SoaException(SoaBaseCode.NotNull, "id字段不允许为空");
            
    }
    

            @Override
            public String toString(findSkillById_args bean) { return bean == null ? "null" : bean.toString(); }

            }

            public static class FindSkillById_resultSerializer implements TBeanSerializer<findSkillById_result>{
              @Override
              public void read(findSkillById_result bean, TProtocol iprot) throws TException{

                com.isuwang.org.apache.thrift.protocol.TField schemeField;
                iprot.readStructBegin();

                while(true){
                  schemeField = iprot.readFieldBegin();
                  if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

                  switch(schemeField.id){
                    case 0:  //SUCCESS
                       if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRUCT){
                       
            bean.setSuccess(new pn.eric.microservice.skill.dto.TSkill());
            new TSkillSerializer().read(bean.getSuccess(), iprot);
          
                       }else{
                          com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    /*
                    case 1: //ERROR
                        bean.setSoaException(new SoaException());
                        new SoaExceptionSerializer().read(bean.getSoaException(), iprot);
                        break A;
                    */
                    default:
                      com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  iprot.readFieldEnd();
                }
                iprot.readStructEnd();

                validate(bean);
              }
            
      @Override
      public void write(findSkillById_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("findSkillById_result"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("success", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, (short) 0));
              new TSkillSerializer().write(bean.getSuccess(), oprot);
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
    public void validate(findSkillById_result bean) throws TException{
      
              if(bean.getSuccess() == null)
              throw new SoaException(SoaBaseCode.NotNull, "success字段不允许为空");
            
                if(bean.getSuccess() != null)
                new TSkillSerializer().validate(bean.getSuccess());
              
    }
    

            @Override
            public String toString(findSkillById_result bean) { return bean == null ? "null" : bean.toString(); }
          }

            public static class findSkillById<I extends pn.eric.microservice.skill.service.SkillService> extends SoaProcessFunction<I, findSkillById_args, findSkillById_result, FindSkillById_argsSerializer,  FindSkillById_resultSerializer>{
               public findSkillById(){
                   super("findSkillById", new FindSkillById_argsSerializer(),  new FindSkillById_resultSerializer());
               }
            
               @Override
               public findSkillById_result getResult(I iface, findSkillById_args args) throws TException{
                   findSkillById_result result = new findSkillById_result();
              
                      result.success = iface.findSkillById(args.id);
                    
                   return result;
               }
              

               @Override
               public findSkillById_args getEmptyArgsInstance(){
                  return new findSkillById_args();
               }

               @Override
               protected boolean isOneway(){
                  return false;
               }
            }
          
            public static class getAllSkills_args {
            

            @Override
            public String toString(){
              StringBuilder stringBuilder = new StringBuilder("{");
                
              if(stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
              stringBuilder.append("}");

              return stringBuilder.toString();
            }

          }


            public static class getAllSkills_result {

            
                  private java.util.List<pn.eric.microservice.skill.dto.TSkill> success;
                  public java.util.List<pn.eric.microservice.skill.dto.TSkill> getSuccess(){
                    return success;
                  }

                  public void setSuccess(java.util.List<pn.eric.microservice.skill.dto.TSkill> success){
                    this.success = success;
                  }


                  @Override
                  public String toString(){
                  StringBuilder stringBuilder = new StringBuilder("{");
                    
      stringBuilder.append("\"").append("success").append("\":").append(success).append(",");
    
                    stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                    stringBuilder.append("}");

                  return stringBuilder.toString();
                }

                
            }

            public static class GetAllSkills_argsSerializer implements TBeanSerializer<getAllSkills_args>{
            
      @Override
      public void read(getAllSkills_args bean, TProtocol iprot) throws TException{

        com.isuwang.org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();

        while(true){
          schemeField = iprot.readFieldBegin();
          if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

          switch(schemeField.id){
          
            
                default:
                  com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        validate(bean);
      }
    
            
      @Override
      public void write(getAllSkills_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("getAllSkills_args"));

      
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
    public void validate(getAllSkills_args bean) throws TException{
      
    }
    

            @Override
            public String toString(getAllSkills_args bean) { return bean == null ? "null" : bean.toString(); }

            }

            public static class GetAllSkills_resultSerializer implements TBeanSerializer<getAllSkills_result>{
              @Override
              public void read(getAllSkills_result bean, TProtocol iprot) throws TException{

                com.isuwang.org.apache.thrift.protocol.TField schemeField;
                iprot.readStructBegin();

                while(true){
                  schemeField = iprot.readFieldBegin();
                  if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

                  switch(schemeField.id){
                    case 0:  //SUCCESS
                       if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.LIST){
                       {
            com.isuwang.org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
            bean.setSuccess(new java.util.ArrayList<>(_list0.size));
            for(int _i2 = 0; _i2 < _list0.size; ++ _i2){
              pn.eric.microservice.skill.dto.TSkill _elem1 = new pn.eric.microservice.skill.dto.TSkill();
                  new TSkillSerializer().read(_elem1, iprot);
              bean.getSuccess().add(_elem1);
            }
            iprot.readListEnd();
            }
          
                       }else{
                          com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    /*
                    case 1: //ERROR
                        bean.setSoaException(new SoaException());
                        new SoaExceptionSerializer().read(bean.getSoaException(), iprot);
                        break A;
                    */
                    default:
                      com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  iprot.readFieldEnd();
                }
                iprot.readStructEnd();

                validate(bean);
              }
            
      @Override
      public void write(getAllSkills_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("getAllSkills_result"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("success", com.isuwang.org.apache.thrift.protocol.TType.LIST, (short) 0));
            oprot.writeListBegin(new com.isuwang.org.apache.thrift.protocol.TList(com.isuwang.org.apache.thrift.protocol.TType.STRUCT, bean.getSuccess().size()));
              for(pn.eric.microservice.skill.dto.TSkill item : bean.getSuccess()){
               new TSkillSerializer().write(item, oprot);
              }
              oprot.writeListEnd();
        
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
    public void validate(getAllSkills_result bean) throws TException{
      
              if(bean.getSuccess() == null)
              throw new SoaException(SoaBaseCode.NotNull, "success字段不允许为空");
            
    }
    

            @Override
            public String toString(getAllSkills_result bean) { return bean == null ? "null" : bean.toString(); }
          }

            public static class getAllSkills<I extends pn.eric.microservice.skill.service.SkillService> extends SoaProcessFunction<I, getAllSkills_args, getAllSkills_result, GetAllSkills_argsSerializer,  GetAllSkills_resultSerializer>{
               public getAllSkills(){
                   super("getAllSkills", new GetAllSkills_argsSerializer(),  new GetAllSkills_resultSerializer());
               }
            
               @Override
               public getAllSkills_result getResult(I iface, getAllSkills_args args) throws TException{
                   getAllSkills_result result = new getAllSkills_result();
              
                      result.success = iface.getAllSkills();
                    
                   return result;
               }
              

               @Override
               public getAllSkills_args getEmptyArgsInstance(){
                  return new getAllSkills_args();
               }

               @Override
               protected boolean isOneway(){
                  return false;
               }
            }
          
            public static class querySkills_args {
            
               private pn.eric.microservice.skill.dto.TSkillPageRequest pageRequest;

               public pn.eric.microservice.skill.dto.TSkillPageRequest getPageRequest(){
                  return this.pageRequest;
               }
               public void setPageRequest(pn.eric.microservice.skill.dto.TSkillPageRequest pageRequest){
                  this.pageRequest = pageRequest;
               }
             
               private pn.eric.microservice.skill.dto.TSkillQueryCondition tSkillQueryCondition;

               public pn.eric.microservice.skill.dto.TSkillQueryCondition getTSkillQueryCondition(){
                  return this.tSkillQueryCondition;
               }
               public void setTSkillQueryCondition(pn.eric.microservice.skill.dto.TSkillQueryCondition tSkillQueryCondition){
                  this.tSkillQueryCondition = tSkillQueryCondition;
               }
             

            @Override
            public String toString(){
              StringBuilder stringBuilder = new StringBuilder("{");
                
      stringBuilder.append("\"").append("pageRequest").append("\":").append(this.pageRequest == null ? "null" : this.pageRequest.toString()).append(",");
    
      stringBuilder.append("\"").append("tSkillQueryCondition").append("\":").append(this.tSkillQueryCondition == null ? "null" : this.tSkillQueryCondition.toString()).append(",");
    
              if(stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
              stringBuilder.append("}");

              return stringBuilder.toString();
            }

          }


            public static class querySkills_result {

            
                  private pn.eric.microservice.skill.dto.TSkillQueryResponse success;
                  public pn.eric.microservice.skill.dto.TSkillQueryResponse getSuccess(){
                    return success;
                  }

                  public void setSuccess(pn.eric.microservice.skill.dto.TSkillQueryResponse success){
                    this.success = success;
                  }


                  @Override
                  public String toString(){
                  StringBuilder stringBuilder = new StringBuilder("{");
                    
      stringBuilder.append("\"").append("success").append("\":").append(this.success == null ? "null" : this.success.toString()).append(",");
    
                    stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
                    stringBuilder.append("}");

                  return stringBuilder.toString();
                }

                
            }

            public static class QuerySkills_argsSerializer implements TBeanSerializer<querySkills_args>{
            
      @Override
      public void read(querySkills_args bean, TProtocol iprot) throws TException{

        com.isuwang.org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();

        while(true){
          schemeField = iprot.readFieldBegin();
          if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

          switch(schemeField.id){
          
              case 1:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRUCT){
                    
            bean.setPageRequest(new pn.eric.microservice.skill.dto.TSkillPageRequest());
            new TSkillPageRequestSerializer().read(bean.getPageRequest(), iprot);
          
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
              case 2:
                if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRUCT){
                    
            bean.setTSkillQueryCondition(new pn.eric.microservice.skill.dto.TSkillQueryCondition());
            new TSkillQueryConditionSerializer().read(bean.getTSkillQueryCondition(), iprot);
          
                }else{
                     com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
              
            
                default:
                  com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        validate(bean);
      }
    
            
      @Override
      public void write(querySkills_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("querySkills_args"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("pageRequest", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, (short) 1));
              new TSkillPageRequestSerializer().write(bean.getPageRequest(), oprot);
            oprot.writeFieldEnd();
          
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("tSkillQueryCondition", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, (short) 2));
              new TSkillQueryConditionSerializer().write(bean.getTSkillQueryCondition(), oprot);
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
    public void validate(querySkills_args bean) throws TException{
      
              if(bean.getPageRequest() == null)
              throw new SoaException(SoaBaseCode.NotNull, "pageRequest字段不允许为空");
            
                if(bean.getPageRequest() != null)
                new TSkillPageRequestSerializer().validate(bean.getPageRequest());
              
              if(bean.getTSkillQueryCondition() == null)
              throw new SoaException(SoaBaseCode.NotNull, "tSkillQueryCondition字段不允许为空");
            
                if(bean.getTSkillQueryCondition() != null)
                new TSkillQueryConditionSerializer().validate(bean.getTSkillQueryCondition());
              
    }
    

            @Override
            public String toString(querySkills_args bean) { return bean == null ? "null" : bean.toString(); }

            }

            public static class QuerySkills_resultSerializer implements TBeanSerializer<querySkills_result>{
              @Override
              public void read(querySkills_result bean, TProtocol iprot) throws TException{

                com.isuwang.org.apache.thrift.protocol.TField schemeField;
                iprot.readStructBegin();

                while(true){
                  schemeField = iprot.readFieldBegin();
                  if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP){ break;}

                  switch(schemeField.id){
                    case 0:  //SUCCESS
                       if(schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRUCT){
                       
            bean.setSuccess(new pn.eric.microservice.skill.dto.TSkillQueryResponse());
            new TSkillQueryResponseSerializer().read(bean.getSuccess(), iprot);
          
                       }else{
                          com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    /*
                    case 1: //ERROR
                        bean.setSoaException(new SoaException());
                        new SoaExceptionSerializer().read(bean.getSoaException(), iprot);
                        break A;
                    */
                    default:
                      com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  iprot.readFieldEnd();
                }
                iprot.readStructEnd();

                validate(bean);
              }
            
      @Override
      public void write(querySkills_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("querySkills_result"));

      
            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("success", com.isuwang.org.apache.thrift.protocol.TType.STRUCT, (short) 0));
              new TSkillQueryResponseSerializer().write(bean.getSuccess(), oprot);
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
    public void validate(querySkills_result bean) throws TException{
      
              if(bean.getSuccess() == null)
              throw new SoaException(SoaBaseCode.NotNull, "success字段不允许为空");
            
                if(bean.getSuccess() != null)
                new TSkillQueryResponseSerializer().validate(bean.getSuccess());
              
    }
    

            @Override
            public String toString(querySkills_result bean) { return bean == null ? "null" : bean.toString(); }
          }

            public static class querySkills<I extends pn.eric.microservice.skill.service.SkillService> extends SoaProcessFunction<I, querySkills_args, querySkills_result, QuerySkills_argsSerializer,  QuerySkills_resultSerializer>{
               public querySkills(){
                   super("querySkills", new QuerySkills_argsSerializer(),  new QuerySkills_resultSerializer());
               }
            
               @Override
               public querySkills_result getResult(I iface, querySkills_args args) throws TException{
                   querySkills_result result = new querySkills_result();
              
                      result.success = iface.querySkills(args.pageRequest,args.tSkillQueryCondition);
                    
                   return result;
               }
              

               @Override
               public querySkills_args getEmptyArgsInstance(){
                  return new querySkills_args();
               }

               @Override
               protected boolean isOneway(){
                  return false;
               }
            }
          

        public static class getServiceMetadata_args {

          @Override
          public String toString() {
            return "{}";
          }
        }


        public static class getServiceMetadata_result {

          private String success;

          public String getSuccess() {
            return success;
          }

          public void setSuccess(String success) {
            this.success = success;
          }

          @Override
          public String toString() {
            StringBuilder stringBuilder = new StringBuilder("{");
              stringBuilder.append("\"").append("success").append("\":\"").append(this.success).append("\",");
              stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
              stringBuilder.append("}");

            return stringBuilder.toString();
          }
        }

        public static class GetServiceMetadata_argsSerializer implements TBeanSerializer<getServiceMetadata_args> {

          @Override
          public void read(getServiceMetadata_args bean, TProtocol iprot) throws TException {

            com.isuwang.org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
              schemeField = iprot.readFieldBegin();
              if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP) {
                break;
              }
              switch (schemeField.id) {
                default:
                com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);

              }
              iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
          }


          @Override
          public void write(getServiceMetadata_args bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("getServiceMetadata_args"));
            oprot.writeFieldStop();
            oprot.writeStructEnd();
          }

          public void validate(getServiceMetadata_args bean) throws TException {}

          @Override
          public String toString(getServiceMetadata_args bean) {
            return bean == null ? "null" : bean.toString();
          }

        }

        public static class GetServiceMetadata_resultSerializer implements TBeanSerializer<getServiceMetadata_result> {
          @Override
          public void read(getServiceMetadata_result bean, TProtocol iprot) throws TException {

            com.isuwang.org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
              schemeField = iprot.readFieldBegin();
              if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STOP) {
                break;
              }

              switch (schemeField.id) {
                case 0:  //SUCCESS
                if (schemeField.type == com.isuwang.org.apache.thrift.protocol.TType.STRING) {
                  bean.setSuccess(iprot.readString());
                } else {
                  com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
                default:
                com.isuwang.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
          }

          @Override
          public void write(getServiceMetadata_result bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new com.isuwang.org.apache.thrift.protocol.TStruct("getServiceMetadata_result"));

            oprot.writeFieldBegin(new com.isuwang.org.apache.thrift.protocol.TField("success", com.isuwang.org.apache.thrift.protocol.TType.STRING, (short) 0));
            oprot.writeString(bean.getSuccess());
            oprot.writeFieldEnd();

            oprot.writeFieldStop();
            oprot.writeStructEnd();
          }

          public void validate(getServiceMetadata_result bean) throws TException {

            if (bean.getSuccess() == null)
            throw new SoaException(SoaBaseCode.NotNull, "success字段不允许为空");
          }

          @Override
          public String toString(getServiceMetadata_result bean) {
            return bean == null ? "null" : bean.toString();
          }
        }

        public static class getServiceMetadata<I extends pn.eric.microservice.skill.service.SkillService> extends SoaProcessFunction<I, getServiceMetadata_args, getServiceMetadata_result, GetServiceMetadata_argsSerializer, GetServiceMetadata_resultSerializer> {
          public getServiceMetadata() {
            super("getServiceMetadata", new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer());
          }

          @Override
          public getServiceMetadata_result getResult(I iface, getServiceMetadata_args args) throws TException {
            getServiceMetadata_result result = new getServiceMetadata_result();

            try (InputStreamReader isr = new InputStreamReader(SkillServiceCodec.class.getClassLoader().getResourceAsStream("pn.eric.microservice.skill.service.SkillService.xml"));
            BufferedReader in = new BufferedReader(isr)) {
              int len = 0;
              StringBuilder str = new StringBuilder("");
              String line;
              while ((line = in.readLine()) != null) {

                if (len != 0) {
                  str.append("\r\n").append(line);
                } else {
                  str.append(line);
                }
                len++;
              }
              result.success = str.toString();

            } catch (Exception e) {
              e.printStackTrace();
              result.success = "";
            }

            return result;
          }

          @Override
          public getServiceMetadata_args getEmptyArgsInstance() {
            return new getServiceMetadata_args();
          }

          @Override
          protected boolean isOneway() {
            return false;
          }
        }

        @SuppressWarnings("unchecked")
        public static class Processor<I extends pn.eric.microservice.skill.service.SkillService> extends SoaBaseProcessor{
          public Processor(I iface){
            super(iface, getProcessMap(new java.util.HashMap<>()));
          }

          @SuppressWarnings("unchecked")
          private static <I extends pn.eric.microservice.skill.service.SkillService> java.util.Map<String, SoaProcessFunction<I, ?, ?, ? extends TBeanSerializer<?>, ? extends TBeanSerializer<?>>> getProcessMap(java.util.Map<String, SoaProcessFunction<I, ?, ?, ? extends TBeanSerializer<?>, ? extends TBeanSerializer<?>>> processMap){
            
                processMap.put("addSkill", new addSkill());
              
                processMap.put("deleteSkill", new deleteSkill());
              
                processMap.put("updateSkill", new updateSkill());
              
                processMap.put("findSkillById", new findSkillById());
              
                processMap.put("getAllSkills", new getAllSkills());
              
                processMap.put("querySkills", new querySkills());
              
            processMap.put("getServiceMetadata", new getServiceMetadata());

            return processMap;
          }
        }

      }
      