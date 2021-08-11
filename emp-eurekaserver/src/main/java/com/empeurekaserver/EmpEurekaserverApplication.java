package com.empeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EmpEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpEurekaserverApplication.class, args);
	}

}
