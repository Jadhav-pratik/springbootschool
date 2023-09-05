package com.boot.springbootschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.boot.springbootschool.controller")
@EntityScan(basePackages = "com.boot.springbootschool.dto")
@EnableJpaRepositories(basePackages = "com.boot.springbootschool.repository")
public class SpringbootschoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootschoolApplication.class, args);
	}

}
