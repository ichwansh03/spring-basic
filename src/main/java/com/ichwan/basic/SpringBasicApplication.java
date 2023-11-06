package com.ichwan.basic;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SpringBasicApplication {

	public static void main(String[] args) {
		//ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBasicApplication.class, args);
		SpringApplication springApplication = new SpringApplication();
		//any configuration for spring application
		springApplication.setBannerMode(Banner.Mode.OFF);

		SpringApplication.run(SpringBasicApplication.class, args);
	}

}
