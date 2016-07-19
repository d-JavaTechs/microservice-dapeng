package pn.eric.microservice;

import com.isuwang.dapeng.core.SoaException;
import org.springframework.transaction.annotation.Transactional;
import pn.eric.microservice.action.*;
import pn.eric.microservice.skill.dto.TSkill;
import pn.eric.microservice.skill.dto.TSkillPageRequest;
import pn.eric.microservice.skill.dto.TSkillQueryCondition;
import pn.eric.microservice.skill.dto.TSkillQueryResponse;
import pn.eric.microservice.skill.service.SkillService;


import java.util.List;

/**
 * Created by Shadow on 2016/7/19.
 */
@Transactional(value = "testDb", rollbackFor = Exception.class)
public class SkillServiceImpl implements SkillService {
    @Override
    public TSkillQueryResponse querySkills(TSkillPageRequest pageRequest, TSkillQueryCondition tSkillQueryCondition) throws SoaException {
        return new SkillQuery(pageRequest,tSkillQueryCondition).execute();
    }

    @Override
    public TSkill addSkill(TSkill tSkill) throws SoaException {
        return new SkillAdd(tSkill).execute();
    }

    @Override
    public void deleteSkill(Integer id) throws SoaException {
         new SkillDelete(id).execute();
    }

    @Override
    public void updateSkill(TSkill tSkill) throws SoaException {
         new SkillUpdate(tSkill).execute();
    }

    @Override
    public TSkill findSkillById(Integer id) throws SoaException {
        return new SkillFindById(id).execute();
    }

    @Override
    public List<TSkill> getAllSkills() throws SoaException {
        return new SkillsGetAll().execute();
    }
}
