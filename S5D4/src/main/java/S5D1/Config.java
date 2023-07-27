package S5D1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import S5D1.entities.Pizza;

@Configuration
public class Config {
	@Bean("margherita")
	Pizza diavolaPizza() {
		return new Pizza("pizza diavola", 10, "nutrizionali");
	}
}
