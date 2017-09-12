package com.example.demo;

import com.example.demo.model.Campaign;
import com.example.demo.model.EntityA;
import org.springframework.stereotype.Component;

@Component
public class CampaignService {
    public EntityA processEntityA(Campaign campaign) {
        EntityA entityA = campaign.getEntityA();
        entityA.setFieldInt(entityA.getFieldInt()/2);
        return entityA;
    }
}
