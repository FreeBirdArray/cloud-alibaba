package com.ghost.cloudconsuamer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsuamer1Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsuamer1Application.class, args);
    }

}
