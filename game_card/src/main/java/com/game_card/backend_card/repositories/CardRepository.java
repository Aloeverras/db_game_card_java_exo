package com.game_card.backend_card.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.game_card.backend_card.models.Card;
import com.game_card.backend_card.models.Ranck;
import com.game_card.backend_card.models.Suit;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
    Card findCardBySuit(Suit suit);
    Card findCardByRanck(Ranck ranck);

    List<Card> findAllCardsBySuit(List<Suit> suits);
    List<Card> findAllCardsByRanck(List<Ranck> ranks);

    List<Card> findAll();

    Card createCard(Card card);
    Card createCard(Suit suit, Ranck ranck);
}
