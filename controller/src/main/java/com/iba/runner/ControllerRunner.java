package com.iba.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.iba")
@EnableJpaRepositories(basePackages = "com.iba")
@EntityScan(basePackages = "com.iba")
public class ControllerRunner {

    public static void main(String[] args) {
        SpringApplication.run(ControllerRunner.class, args);
    }

}
