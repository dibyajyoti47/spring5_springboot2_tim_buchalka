package academy.learnprogramming.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import academy.learning.AppConfig;
import academy.learning.Game;
import academy.learning.MessageGenerator;
import academy.learning.NumberGenerator;

public class Main {
	private static final Logger log = LoggerFactory.getLogger(Main.class);
	private static final String CONFIG_LOCATION = "beans.xml";
	public static void main(String[] args) {
		log.info("Guess the number game");
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		NumberGenerator numberGenerator = context.getBean("numberGenerator", NumberGenerator.class);
		int number = numberGenerator.next()	;
		log.info("number = {}", number);
        Game game = context.getBean(Game.class);
        MessageGenerator mg = context.getBean(MessageGenerator.class);
        System.out.println(mg.getResultMessage() + mg.getMainMessage());
        game.reset();
		context.close();
	}
}