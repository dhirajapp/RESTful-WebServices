package com.code4dhiraj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class SpringbootRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestapiApplication.class, args);
	}

}
