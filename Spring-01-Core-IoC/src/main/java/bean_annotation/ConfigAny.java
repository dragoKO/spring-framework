package bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigAny {
    @Bean
    String str(){return "Developer";}
    @Bean
    Integer num(){return 100_000;}
}
