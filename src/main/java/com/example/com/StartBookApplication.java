package com.example.com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class StartBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartBookApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(BookRepository repository) {
        return args -> {
            repository.save(new Book("The adventure of Sherlock Holmes", "Conan Doyle", new BigDecimal("15.41")));
            repository.save(new Book("Pride and Prejudice", "Jane Austen", new BigDecimal("9.69")));
            repository.save(new Book("The soul`s gurney", "Micheal Newton", new BigDecimal("47.99")));
        };
    }
}