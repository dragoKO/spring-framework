package stereotypePractice.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ExtraHours {
    private final int extraHours = 10;

    public int extraHours() {
        System.out.println(extraHours+" extra hours added");
        return extraHours;
    }
}
