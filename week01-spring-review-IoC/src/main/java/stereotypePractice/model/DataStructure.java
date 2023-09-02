package stereotypePractice.model;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor // dependency injection. Done automatically with @AllArgsConstructor -> only if we have one constructor.
@Component
public class DataStructure {
    private final int hours = 100;
    ExtraHours extraHours;

    public void getTotalHours() {
        System.out.println("Total hours  DataStructure: " + (hours + extraHours.extraHours()));
    }
}
