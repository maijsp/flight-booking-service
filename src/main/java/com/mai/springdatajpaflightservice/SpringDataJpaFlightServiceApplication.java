package com.mai.springdatajpaflightservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class SpringDataJpaFlightServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaFlightServiceApplication.class, args);
    }

}
