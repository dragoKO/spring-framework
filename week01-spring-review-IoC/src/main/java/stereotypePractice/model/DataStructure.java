package stereotypePractice.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class DataStructure {
    private final int hours=100;

    public void getTotalHours(){
        System.out.println("Total hours  DataStructure: "+hours);
    }
}
