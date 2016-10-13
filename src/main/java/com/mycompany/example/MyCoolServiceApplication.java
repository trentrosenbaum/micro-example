package com.mycompany.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class MyCoolServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyCoolServiceApplication.class, args);
    }
}
