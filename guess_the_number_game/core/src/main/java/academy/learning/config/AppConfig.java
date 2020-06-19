package academy.learning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import academy.learning.MessageGenerator;
import academy.learning.MessageGeneratorImpl;

@Configuration
@Import(GameConfig.class)
@ComponentScan(basePackages = {"academy.learning", "academy.learnprogramming"})
public class AppConfig {
	@Bean
	public MessageGenerator messageGenerator () {
		return new MessageGeneratorImpl();
	}
}
