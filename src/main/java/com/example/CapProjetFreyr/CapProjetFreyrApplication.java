package com.example.CapProjetFreyr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

@SpringBootApplication
public class CapProjetFreyrApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapProjetFreyrApplication.class, args);
	}
}
