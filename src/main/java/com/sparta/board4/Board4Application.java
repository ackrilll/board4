package com.sparta.board4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Board4Application {

	public static void main(String[] args) {
		SpringApplication.run(Board4Application.class, args);
	}

}
