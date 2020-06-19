package academy.learnprogramming.console;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import academy.learning.config.AppConfig;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
	public static void main(String[] args) {
		log.info("Guess the number game");
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.close();
	}
}
