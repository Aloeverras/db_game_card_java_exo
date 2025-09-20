package com.game_card.backend_card.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.game_card.backend_card.models.Suit;

@Repository
public interface SuitRepository extends JpaRepository<Suit, Long>{
    Suit findSuitByColorName(char colorName);
    Suit findSuitByIsRed(boolean isRed);

    List<Suit> findAllSuitsByColorName(List<Character> colorNames);
    List<Suit> findAllSuitsByIsRed(List<Boolean> isReds);
}
