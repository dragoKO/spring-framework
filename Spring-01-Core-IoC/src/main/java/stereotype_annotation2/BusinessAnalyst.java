package stereotype_annotation2;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BusinessAnalyst {
    private String firstName;
    private String lastName;
    private double salary;
}
