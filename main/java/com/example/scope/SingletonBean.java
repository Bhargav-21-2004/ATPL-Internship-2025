package com.example.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("singletonBean")
@Scope("singleton") 
public class SingletonBean {
    public SingletonBean() {
        System.out.println(" SingletonBean instance created");
    }
}
