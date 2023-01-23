package com.example.practicetask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import({ApplicationConfiguration.class})


@SpringBootApplication
public class ApplicationNums {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationNums.class, args);
    }

}