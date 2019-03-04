package com.project.demo.springbootrestfulclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for spring boot rest api.It will the scan the base package and
 * call the controller
 * 
 * @SpringBootApplication is equivalent to
 *                        using @Configuration, @EnableAutoConfiguration,
 *                        and @ComponentScan
 */
@SpringBootApplication(scanBasePackages = { "com.project.demo.springbootrestfulapi.controller" })
public class SpringBootRestfulClientApplication {

	/**
	 * This the method which act as entry point for rest api controller
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestfulClientApplication.class, args);
	}
}
