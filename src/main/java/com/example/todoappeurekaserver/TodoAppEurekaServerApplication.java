package com.example.todoappeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TodoAppEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoAppEurekaServerApplication.class, args);
    }

}
