package com.game_card.backend_card.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game_card.backend_card.repositories.SuitRepository;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Service
public class SuitService {
    @Autowired
    private final SuitRepository SUITREPOSITORY;
}
