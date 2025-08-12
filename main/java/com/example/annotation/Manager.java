package com.example.annotation;

import org.springframework.stereotype.Component;

@Component("managerBean")
public class Manager implements Leader {
    public void guideTeam() {
        System.out.println("Manager: Leading with strategy.");
    }
}
