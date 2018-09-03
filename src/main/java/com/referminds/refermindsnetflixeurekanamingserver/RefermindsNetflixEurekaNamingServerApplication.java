package com.referminds.refermindsnetflixeurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RefermindsNetflixEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefermindsNetflixEurekaNamingServerApplication.class, args);
	}
}
