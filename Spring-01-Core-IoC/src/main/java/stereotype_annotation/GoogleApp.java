package stereotype_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stereotype_annotation2.BusinessAnalyst;

public class GoogleApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(ConfigGoogle.class);

        Developer developer = container.getBean(Developer.class);
        Tester tester = container.getBean(Tester.class);
        ProductOwner productOwner = container.getBean(ProductOwner.class);
        BusinessAnalyst businessAnalyst = container.getBean(BusinessAnalyst.class);


        System.out.println(developer);
        System.out.println(tester);
        System.out.println(productOwner);
        System.out.println(businessAnalyst);
    }
}
