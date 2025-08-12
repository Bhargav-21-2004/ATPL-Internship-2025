package com.example.value;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServerApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ServerConfig cfg = ctx.getBean(ServerConfig.class);
        cfg.printConfig();
        ctx.close();
    }
}
