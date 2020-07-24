package com.food.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FoodDeliveryApiApplication {
	@Autowired
	   RestTemplate restTemplate;
	public static void main(String[] args) {
		SpringApplication.run(FoodDeliveryApiApplication.class, args);
	}
	@Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();   
	   }

}
