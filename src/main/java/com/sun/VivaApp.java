package com.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class VivaApp extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder appBuilder)
   {
		return appBuilder.sources(VivaApp.class);
	}

	public static void main(String[] args) throws Exception
   {
		SpringApplication.run(VivaApp.class, args);
	}
}
