package stereotype_annotation;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Tester {
    private String firstName;
    private String lastName;
    private double salary;
}
