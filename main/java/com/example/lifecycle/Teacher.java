package com.example.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Teacher implements InitializingBean, DisposableBean {

    public Teacher() {
        System.out.println("Teacher Constructor called");
    }

    @PostConstruct
    public void annotationInit() {
        System.out.println("Teacher: @PostConstruct annotationInit()");
    }

    @PreDestroy
    public void annotationDestroy() {
        System.out.println("Teacher: @PreDestroy annotationDestroy()");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println(" Teacher: afterPropertiesSet() InitializingBean");
    }

    @Override
    public void destroy() {
        System.out.println(" Teacher: destroy()  DisposableBean");
    }
    public void initXml() {
        System.out.println(" Teacher initXml() called from XML");
    }

    public void destroyXml() {
        System.out.println(" Teacher destroyXml() called from XML");
    }

	public void teach() {
        System.out.println(" Teacher is teaching");
		
	}
}


