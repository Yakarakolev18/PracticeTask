package com.example.practicetask;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;


@Configuration
@Service
public class ApplicationConfiguration {
    @Bean
    public SumNumService sumNumbersService() {
        return new SumNumService();
    }
}