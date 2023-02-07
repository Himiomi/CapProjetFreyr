package com.example.CapProjetFreyr.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = {"com.example.CapProjetFreyr.*"})
public class CapProjetFreyrApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapProjetFreyrApplication.class, args);
	}

}
