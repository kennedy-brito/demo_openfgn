package com.kennedy.demo_openfgn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoOpenfgnApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOpenfgnApplication.class, args);
	}

}
