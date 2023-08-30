package com.tesla;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TeslaApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        Tesla tesla = container.getBean(Tesla.class);
        Engine engine = container.getBean(Engine.class);

        System.out.println(engine);
        System.out.println(tesla);
    }
}
