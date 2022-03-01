package edu.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"edu.persistence"})
@EntityScan(basePackages = {"edu.domain"})
@ComponentScan(basePackages = {"edu.persistence","edu.domain","edu.web"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
