package com.example.eurekaApp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class EurekaApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApp1Application.class, args);
	}

}
