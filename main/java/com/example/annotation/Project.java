package com.example.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Project {

    private Leader leader;

    @Autowired
    public Project(@Qualifier("teamLeadBean") Leader leader) {
        this.leader = leader;
    }

    public void startProject() {
        leader.guideTeam();
    }
}
