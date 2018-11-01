package com.xiaochen.ec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.xiaochen.ec.controller"})
public class EcApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcApplication.class, args);
	}
}
