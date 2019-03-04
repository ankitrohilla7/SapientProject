package com.project.demo.springbootrestfulclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication is equivalent to using @Configuration, 
 * @EnableAutoConfiguration, and @ComponentScan
 */
@SpringBootApplication(scanBasePackages = {"com.project.demo.springbootrestfulapi.controller"})
public class SpringBootRestfulClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestfulClientApplication.class, args);
	}
}
