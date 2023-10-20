package com.nt.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;

@OpenAPIDefinition
@Configuration
public class SpringdocConfig{

@Bean
public OpenAPI baseOpenApi(){

return new OpenAPI().info(new io.swagger.v3.oas.models.info.Info()
		.title("garage").version("1.0.0"));
//		new Info().title("Spring Doc").version("1.0.0"));
}

}