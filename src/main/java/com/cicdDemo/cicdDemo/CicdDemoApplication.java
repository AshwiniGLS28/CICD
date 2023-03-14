package com.cicdDemo.cicdDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.cicdDemo.controller.DataController;

@SpringBootApplication
@ComponentScan(basePackageClasses = DataController.class)
public class CicdDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdDemoApplication.class, args);
	}

}
