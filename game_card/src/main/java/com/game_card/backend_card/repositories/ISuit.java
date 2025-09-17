package com.game_card.backend_card.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.game_card.backend_card.models.Suit;

@Repository
public interface ISuit extends IBase<Suit, Byte> {
    Optional<Boolean> findByIsRed(Suit suit);
    List<Boolean> findAllIsRed(List<Suit> suits);
};