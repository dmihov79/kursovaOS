package com.tusofia.os.kursova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan(basePackages = "com.tusofia.os.kursova")
@EntityScan(basePackages = {"com.tusofia.os.kursova.entities"})
public class KursovaApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(KursovaApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(KursovaApplication.class);
	}
}
