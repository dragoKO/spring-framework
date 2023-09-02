package stereotypePractice;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stereotypePractice.config.ConfigApp;
import stereotypePractice.model.DataStructure;
import stereotypePractice.model.DevOps;
import stereotypePractice.model.Microservices;

public class LMS_APP {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigApp.class);

        var devOps = applicationContext.getBean(DevOps.class);
        var microservices = applicationContext.getBean(Microservices.class);
        var dataStructure = applicationContext.getBean(DataStructure.class);

        devOps.getTotalHours();
        microservices.getTotalHours();
        dataStructure.getTotalHours();


    }


}
