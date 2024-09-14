package com.example.restaurant_cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories("com")
@ComponentScan("com")
//@EnableDiscoveryClient
@EntityScan("com")
@SpringBootApplication
public class RestaurantCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantCartApplication.class, args);
	}

}
