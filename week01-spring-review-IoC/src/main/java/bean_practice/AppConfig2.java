package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {

    @Bean("welcomeMessage")
    String welcomeMessage(){
        return "Welcome to Google.";
    }

    @Bean("springCoreMessage")
    String springCoreMessage(){
        return "Spring Core.";
    }
}
