package com.game_card.backend_card.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.game_card.backend_card.models.Suit;
import com.game_card.backend_card.repositories.ISuit;

@Service
public class SuitService extends BaseService<ISuit> {

    public SuitService(ISuit repositoryModel) {
        super(repositoryModel);
    };

    public Optional<Suit> findAllByCodename(Byte codeName){
        return this.repositoryModel.findByCodename(codeName);
    }
}
