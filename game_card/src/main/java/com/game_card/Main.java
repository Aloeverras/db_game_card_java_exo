package com.game_card;

import com.game_card.backend_card.models.Suit;

public class Main {
    public static void main(String[] args) {
        Suit heart = new Suit(Long.valueOf(0), 'H');
        try {
            System.out.println("Hello world");
            System.out.println(heart.getNameModel());
        } catch (Exception e) {
            System.err.println("eror : " + e.getMessage());
        };
    }
}