package com.example.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Testing Singleton Scope:");
        SingletonBean singleton1 = context.getBean("singletonBean", SingletonBean.class);
        SingletonBean singleton2 = context.getBean("singletonBean", SingletonBean.class);
        System.out.println("Are singleton beans same? " + (singleton1 == singleton2)); 

        System.out.println("Testing Prototype Scope:");
        PrototypeBean prototype1 = context.getBean("prototypeBean", PrototypeBean.class);
        PrototypeBean prototype2 = context.getBean("prototypeBean", PrototypeBean.class);
        System.out.println("Are prototype beans same? " + (prototype1 == prototype2)); 

        context.close();
    }
}
