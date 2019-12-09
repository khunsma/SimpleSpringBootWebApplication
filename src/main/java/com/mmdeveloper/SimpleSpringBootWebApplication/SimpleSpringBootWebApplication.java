package com.mmdeveloper.SimpleSpringBootWebApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SimpleSpringBootWebApplication extends SpringBootServletInitializer{
	

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SimpleSpringBootWebApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringBootWebApplication.class, args);
	}

}
