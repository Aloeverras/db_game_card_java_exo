package com.game_card.backend_card.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.game_card.backend_card.models.Card;
import com.game_card.backend_card.models.Ranck;
import com.game_card.backend_card.models.Suit;

@Repository
public interface ICard extends IBase<Card, Byte[]> {
    Optional<Suit> findBySuit(Suit suit);
    Optional<Ranck> findByRanck(Ranck ranck);

    List<Suit> findAllBySuit(List<Suit> suits);
    List<Ranck> findAllByRanck(List<Ranck> rancks);
}
