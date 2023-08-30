package stereotype_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan -> only in own package
@ComponentScans({
        @ComponentScan(basePackages = "stereotype_annotation"),
        @ComponentScan(basePackages = "stereotype_annotation2")
})
public class ConfigGoogle {
}
