package com.spring.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ActuatorTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorTestApplication.class, args);
	}
	
	@GetMapping("/go")
	public String first()
	{
		return "FIRST";
	}
	@GetMapping("/go1")
	public String second()
	{
		return "FIRST";
	}
	@GetMapping("/go2")
	public String third()
	{
		return "FIRST";
	}
	
	@Bean
	public CustomEndpont end()
	{
		return new CustomEndpont();
	}
	
	@Bean
	public WritePojo pojo()
	{
		return new WritePojo();
	}

}
