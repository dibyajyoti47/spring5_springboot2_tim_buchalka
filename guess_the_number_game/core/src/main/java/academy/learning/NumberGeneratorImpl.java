package academy.learning;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("numberGenerator")
public class NumberGeneratorImpl implements NumberGenerator {
	private final Random random = new Random();
	
//	@Autowired
//	@Qualifier("maxNumber")
	private final int maxNumber;
	
	@Autowired
	public NumberGeneratorImpl(@Qualifier("maxNumber") int maxNumber) {
		this.maxNumber = maxNumber;		
	}

	public int next() {
		return random.nextInt(maxNumber);
	}

	public int getMaxNumber() {
		return 0;
	}
}
