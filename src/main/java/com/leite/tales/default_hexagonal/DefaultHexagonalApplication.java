package com.leite.tales.default_hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.democrata.default_hexagonal.application.ports"})
@EntityScan("com.democrata.default_hexagonal.persistence.entity")
@EnableJpaRepositories("com.democrata.default_hexagonal.persistence.repository")
public class DefaultHexagonalApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DefaultHexagonalApplication.class, args);
	}

}
