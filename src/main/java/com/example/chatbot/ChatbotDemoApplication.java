package com.example.chatbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ChatbotDemoApplication {

    public static void main(String[] args) {
        // Start the Spring Boot application
        SpringApplication.run(ChatbotDemoApplication.class, args);
    }
@Bean
    public RestTemplate restTemplate() {
        return new RestTemplate(); // Defining RestTemplate as a bean
    }

}


