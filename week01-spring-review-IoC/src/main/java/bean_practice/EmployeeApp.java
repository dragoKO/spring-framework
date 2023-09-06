package bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);

        FullTimeEmployee fullTimeEmployee = applicationContext.getBean(FullTimeEmployee.class);
        PartTimeEmployee partTimeEmployee = applicationContext.getBean(PartTimeEmployee.class);

        fullTimeEmployee.createAccount();
        partTimeEmployee.createAccount();

        String welcomeMessage = applicationContext.getBean("welcomeMessage",String.class);
        System.out.println(welcomeMessage);

        String springCoreMessage = applicationContext.getBean("springCoreMessage",String.class);
        System.out.println(springCoreMessage);

    }
}
