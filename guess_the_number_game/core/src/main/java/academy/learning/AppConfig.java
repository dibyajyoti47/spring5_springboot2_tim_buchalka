package academy.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "academy.learning")
public class AppConfig {
	@Bean
	public MessageGenerator messageGenerator () {
		return new MessageGeneratorImpl();
	}
}
