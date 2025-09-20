package com.game_card.backend_card.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game_card.backend_card.models.Suit;
import com.game_card.backend_card.repositories.SuitRepository;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Service
public class SuitService {
    @Autowired
    private final SuitRepository SUITREPOSITORY;

    public Suit findSuitByColorName(char colorName){
        return SUITREPOSITORY.findSuitByColorName(colorName);
    };

    public Suit findSuitByIsRed(boolean isred){
        return SUITREPOSITORY.findSuitByIsRed(isred);
    };

    public List<Suit> findAllSuitsByColorNames(List<Character> colorNames){
        return SUITREPOSITORY.findAllSuitsByColorNames(colorNames);
    };
}
