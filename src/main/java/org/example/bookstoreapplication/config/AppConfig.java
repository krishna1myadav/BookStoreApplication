package org.example.bookstoreapplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public String welcomeUser(){
        return "WELCOME TO THE BOOKSTORE";
    }
}
