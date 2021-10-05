package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Configuration
@ComponentScan({"controller1","service","model"})
@EnableAutoConfiguration
@Component
@EntityScan


public class Demo2Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Demo2Application.class, args);

		System.out.println("hii");
	}

}
