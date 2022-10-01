package com.qualogy.customerrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.qualogy.customerrestapi.database"})
public class CustomerRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerRestApiApplication.class, args);
    }
}
