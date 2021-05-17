package com.capgemini.ayrton.anuncio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = { "com.capgemini.ayrton.anuncio.model" })
@EnableJpaRepositories(basePackages = { "com.capgemini.ayrton.anuncio.repository" })
@ComponentScan(basePackages = {"com.capgemini.ayrton.anuncio.controller"})
public class AnuncioApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnuncioApplication.class, args);
	}

}
