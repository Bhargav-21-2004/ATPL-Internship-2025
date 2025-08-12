package com.example.annotation;
import org.springframework.stereotype.Component;

@Component("teamLeadBean")
public class TeamLead implements Leader {
    public void guideTeam() {
        System.out.println("Team Lead: Leading with hands-on work.");
    }
}

