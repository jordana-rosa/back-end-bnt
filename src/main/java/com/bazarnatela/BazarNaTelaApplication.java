package com.bazarnatela;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackages="com.bazarnatela.repository")
@SpringBootApplication()
public class BazarNaTelaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BazarNaTelaApplication.class, args);
	}

}
