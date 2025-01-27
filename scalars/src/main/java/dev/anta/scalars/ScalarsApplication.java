package dev.anta.scalars;

import dev.anta.scalars.model.Product;
import dev.anta.scalars.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class ScalarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScalarsApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ProductRepository repository) {
		return args -> {
			List<Product> products = List.of(
					new Product("Hammer", true, 10.1F, new BigDecimal(20.5), LocalDateTime.now()),
					new Product("Screw driver", false, 5.5F, new BigDecimal(9.9), LocalDateTime.now()),
					new Product("Wires", true, 8.2F, new BigDecimal(12.8), LocalDateTime.now())
			);
			repository.saveAll(products);
			repository.findAll().forEach(System.out::println);
		};
	}

}
