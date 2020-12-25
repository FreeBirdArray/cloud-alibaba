package com.ghost.cloudprovider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudProvider1Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProvider1Application.class, args);
    }

}
