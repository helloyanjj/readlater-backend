package com.nju.readlaterbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ReadlaterBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadlaterBackendApplication.class, args);
    }

}

