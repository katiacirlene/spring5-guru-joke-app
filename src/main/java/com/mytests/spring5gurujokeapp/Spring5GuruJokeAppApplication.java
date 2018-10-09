package com.mytests.spring5gurujokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class Spring5GuruJokeAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring5GuruJokeAppApplication.class, args);
    }
}
