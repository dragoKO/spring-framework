package bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {

    @Bean
    FullTimeEmployee fullTimeEmployee(){return new FullTimeEmployee();}

    @Bean
    PartTimeEmployee partTimeEmployee(){return new PartTimeEmployee();}

    //@Bean(name="fullTimeEmployee2")
    @Bean
    @Primary // default bean
    FullTimeEmployee fullTimeEmployee2(){return new FullTimeEmployee();}

    @Bean(name="partTimeEmployee2")
    PartTimeEmployee partTimeEmployee2(){return new PartTimeEmployee();}

}
