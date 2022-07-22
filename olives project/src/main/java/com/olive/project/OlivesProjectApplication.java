package com.olive.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.olive.project.model.Olive;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class OlivesProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlivesProjectApplication.class, args);
	}



}
