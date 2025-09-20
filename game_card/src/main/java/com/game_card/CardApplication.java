package com.game_card;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(CardApplication.class, args);
        } catch (Exception e) {
            System.err.println("error : " + e.getMessage());
        };
    }
}