package com.resitechpro.springeurika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEurikaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEurikaApplication.class, args);
    }

}
