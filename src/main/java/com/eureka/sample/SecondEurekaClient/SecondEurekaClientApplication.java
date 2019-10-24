package com.eureka.sample.SecondEurekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SecondEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondEurekaClientApplication.class, args);
	}

}
