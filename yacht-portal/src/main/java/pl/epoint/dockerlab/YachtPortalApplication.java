package pl.epoint.dockerlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import pl.epoint.dockerlab.yacht.YachtRepository;

@SpringBootApplication
public class YachtPortalApplication {

//	@Bean
//	public YachtRepository yachtRepository() {
//		return new YachtRepository();
//	}

	public static void main(String[] args) {
		SpringApplication.run(YachtPortalApplication.class, args);
	}
}
