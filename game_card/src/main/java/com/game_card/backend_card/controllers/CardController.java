package com.game_card.backend_card.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.game_card.backend_card.models.Card;
import com.game_card.backend_card.models.Ranck;
import com.game_card.backend_card.models.Suit;
import com.game_card.backend_card.services.CardService;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@Getter
@AllArgsConstructor
@RestController
@RequestMapping("api/card")
public class CardController {
    @Autowired
    private final CardService CARDSERVICE;

    @GetMapping
    public List<Card> findAll(){
        return CARDSERVICE.findAll();
    }

    @GetMapping("/{suit}")
    public Card findCardBySuit(Suit suit){
        return CARDSERVICE.findCardBySuit(suit);
    };

    @GetMapping("/{ranck}")
    public Card findCardByRanck(Ranck ranck){
        return CARDSERVICE.findCardByRanck(ranck);
    };

    @GetMapping
    public List<Card> findAllCardsBySuit(List<Suit> suits){
        return CARDSERVICE.findAllCardsBySuit(suits);
    };

    @GetMapping
    public List<Card> findCardsByRanck(List<Ranck> rancks){
        return CARDSERVICE.findAllCardsByRanck(rancks);
    };
}