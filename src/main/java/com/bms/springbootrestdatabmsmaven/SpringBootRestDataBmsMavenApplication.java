package com.bms.springbootrestdatabmsmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.bms.springbootrestrestbmsmaven.entity")
public class SpringBootRestDataBmsMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestDataBmsMavenApplication.class, args);
	}

}
