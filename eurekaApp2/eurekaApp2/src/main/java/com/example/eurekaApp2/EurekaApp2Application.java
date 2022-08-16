package com.example.eurekaApp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApp2Application.class, args);
	}

}
