package com.talooz.ms.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.talooz.ms.common" })
// @EnableDiscoveryClient
public class CommonMicroserviceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonMicroserviceServerApplication.class, args);
	}
}
