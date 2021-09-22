package com.netjstech.datarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Import(SpringDataRestConfiguration.class)
public class SpringBootDataRestGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataRestGradleApplication.class, args);
	}

}
