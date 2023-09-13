package com.akkodis.juanfgr.shop;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}

	@Bean
	public OpenAPI openApi(){
		return new OpenAPI().info(
				new Info()
						.title("Akkodis example")
						.version("0.0.1")
						.description("Akkodis interview example")
		);
	}

}
