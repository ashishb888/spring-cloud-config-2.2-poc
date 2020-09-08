package poc.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import poc.springcloud.properties.AppProperties;

@Slf4j
@RestController
@SpringBootApplication
public class ConfigClientAApplication {

	@Autowired
	private AppProperties ap;

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientAApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ac) {
		return args -> {
			log.debug("kv: " + ap.getKv());
		};
	}

	@GetMapping("/")
	public String hello() {
		return "Hello there!\n";
	}
}
