package com.game_card.backend_card.services;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BaseService<T> {
    @Autowired
    protected final T repositoryModel;
};
