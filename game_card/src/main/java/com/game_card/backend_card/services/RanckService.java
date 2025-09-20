package com.game_card.backend_card.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game_card.backend_card.models.Ranck;
import com.game_card.backend_card.repositories.RanckRepository;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Service
public class RanckService {
    @Autowired
    private final RanckRepository RANCKREPOSITORY;

    public Ranck findRanckByRanckName(char ranckName){
        return RANCKREPOSITORY.findRanckByRanckName(ranckName);
    };

    public List<Ranck> findAllRanksByRanckNames(List<Character> ranckNames){
        return RANCKREPOSITORY.findAllRanckByRanckNames(ranckNames);
    };
}
