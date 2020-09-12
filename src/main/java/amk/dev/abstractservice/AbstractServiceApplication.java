package amk.dev.abstractservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("amk.dev")
@ComponentScan("amk.dev")
@EntityScan("amk.dev")
public class AbstractServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbstractServiceApplication.class, args);
	}

}
