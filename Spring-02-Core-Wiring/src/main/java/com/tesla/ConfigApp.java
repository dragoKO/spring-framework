package com.tesla;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {
//  Direct Wiring
//    @Bean
//    Tesla tesla() {
//        Tesla tesla = new Tesla();
//        tesla.setYear(2022);
//        tesla.setModel("X");
//        tesla.setEngine(engine());
//        return tesla;
//    }

    //    Auto wiring
    @Bean
    Tesla tesla(Engine engine) {
        return new Tesla(2022, "X", engine);
    }


    @Bean
    Engine engine() {
        Engine engine = new Engine();
        engine.setVoltage(350);
        engine.setMotorType("3D1");

        return engine;
    }
}
