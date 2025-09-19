package com.game_card.backend_card.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
@MappedSuperclass
public abstract class BaseModel<T> {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected final Long id;
    protected final T nameModel;

    public abstract Long getId();
    public abstract T getNameModel();
    public abstract String fullNameModel();
}
