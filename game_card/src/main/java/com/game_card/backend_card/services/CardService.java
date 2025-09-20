package com.game_card.backend_card.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game_card.backend_card.models.Card;
import com.game_card.backend_card.models.Ranck;
import com.game_card.backend_card.models.Suit;
import com.game_card.backend_card.repositories.CardRepository;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Service
public class CardService {
    @Autowired
    private final CardRepository CARDREPOSITORY;

    public Card findCardBySuit(Suit suit) {
        return CARDREPOSITORY.findCardBySuit(suit);
    };

    public Card findCardByRanck(Ranck ranck){
        return CARDREPOSITORY.findCardByRanck(ranck);
    };

    public List<Card> findAllCardsBySuit(List<Suit> suits){
        return CARDREPOSITORY.findAllCardsBySuit(suits);
    };

    public List<Card> findAllCardsByRanck(List<Ranck> rancks){
        return CARDREPOSITORY.findAllCardsByRanck(rancks);
    };

    public List<Card> findAll(){
        return CARDREPOSITORY.findAll();
    };

    public Card createCard(Card card){
        return CARDREPOSITORY.save(card); 
    };

    public Card createCard(Suit suit, Ranck ranck){
        return CARDREPOSITORY.createCard(suit, ranck);
    }
}
