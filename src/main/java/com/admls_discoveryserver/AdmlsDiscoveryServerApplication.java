package com.admls_discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AdmlsDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdmlsDiscoveryServerApplication.class, args);
	}

}
