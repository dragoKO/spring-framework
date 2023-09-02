package stereotypePractice.model;


import lombok.Data;
import lombok.NonNull;
import org.springframework.stereotype.Component;

@Data // dependency injection. Done automatically with @AllArgsConstructor -> only if we have one constructor.
@Component
public class DataStructure {
    private final int hours = 100;
    @NonNull
    ExtraHours extraHours;

    public void getTotalHours() {
        System.out.println("Total hours  DataStructure: " + (hours + extraHours.extraHours()));
    }
}
