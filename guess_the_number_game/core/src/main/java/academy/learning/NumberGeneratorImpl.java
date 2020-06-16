package academy.learning;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("numberGenerator")
public class NumberGeneratorImpl implements NumberGenerator {
	private final Random random = new Random();
	private int maxNumber = 100;

	public int next() {
		return random.nextInt(maxNumber);
	}

	public int getMaxNumber() {
		return 0;
	}
}
