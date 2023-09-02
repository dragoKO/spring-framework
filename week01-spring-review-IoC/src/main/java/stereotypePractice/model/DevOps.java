package stereotypePractice.model;

import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component
public class DevOps {
    private final int hours=40;

    public void getTotalHours(){
        System.out.println("Total hours DevOps: "+hours);
    }
}
