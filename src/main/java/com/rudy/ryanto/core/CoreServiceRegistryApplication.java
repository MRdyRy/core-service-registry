package com.rudy.ryanto.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CoreServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreServiceRegistryApplication.class, args);
	}

}
