package com.example.springcloudconfigdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableAutoConfiguration
@EnableConfigServer
public class SpringCloudConfigDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigDemoApplication.class, args);
	}
}
