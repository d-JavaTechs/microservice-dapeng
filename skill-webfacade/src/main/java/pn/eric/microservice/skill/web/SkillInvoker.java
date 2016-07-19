package pn.eric.microservice.skill.web;

import pn.eric.microservice.skill.SkillServiceClient;

/**
 * Created by Shadow on 2016/7/19.
 */
public class SkillInvoker {
    public static void main(String[] args) throws Exception {
        SkillServiceClient client = new SkillServiceClient();
        System.out.println(client.getAllSkills());
    }
}
