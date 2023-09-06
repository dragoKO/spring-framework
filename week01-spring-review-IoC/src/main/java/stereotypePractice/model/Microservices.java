package stereotypePractice.model;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Microservices {
    private final int hours=20;

    public void getTotalHours(){
        System.out.println("Total hours Microservices: "+hours);
    }
}
