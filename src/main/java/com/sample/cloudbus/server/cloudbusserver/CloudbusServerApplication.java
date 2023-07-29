package com.sample.cloudbus.server.cloudbusserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudbusServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudbusServerApplication.class, args);
	}

}
