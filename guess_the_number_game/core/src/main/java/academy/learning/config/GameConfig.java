package academy.learning.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/game.properties")
public class GameConfig {
	
	@Value("${game.maxNumber:20}") // :20 for default value
	private int maxNumber;
	
	@Value("${game.guessCount:5}")
	private int guessCount;
	
	@Bean(name = "maxNumber")
	public int getMaxNumber() {
		return maxNumber;
	}
	
	@Bean(name = "guessCount")
	public int getGuessCount() {
		return guessCount;
	}
	
	
	
}
