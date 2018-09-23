package com.will.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = {
        "com.will.controller",
        "com.will.restclient"
})
public class InitApplication {
	public static void main(String[] args) {
		SpringApplication.run(InitApplication.class, args);
	}
}
