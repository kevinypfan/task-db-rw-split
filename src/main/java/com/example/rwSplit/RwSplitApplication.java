package com.example.rwSplit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Properties;

@SpringBootApplication
@EnableJpaAuditing
public class RwSplitApplication {
	public final static String ENTITY_PACKAGE = "com.example.rwSplit.entities";

	public static void main(String[] args) {
		SpringApplication.run(RwSplitApplication.class, args);
	}

}
