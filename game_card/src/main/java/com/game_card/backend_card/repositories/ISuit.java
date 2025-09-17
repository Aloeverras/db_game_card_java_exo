package com.game_card.backend_card.repositories;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.game_card.backend_card.models.Suit;

@Repository
public interface ISuit extends JpaRepository<Suit, Long> {
    Optional<Suit> findByName(String name);
    Optional<Suit> findBySymbol(String symbol);
    Optional<Suit> findByColor(String color);

    List<Suit> findAllByName(List<String> names);
    List<Suit> findAllBySymbol(List<String> symboles);
};