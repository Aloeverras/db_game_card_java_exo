package com.game_card.backend_card.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class BaseModel<T> {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected Long id;
    protected T nameModel;
    protected T[] posibilities;

    public abstract Long getId();
    public abstract T getNameModel();
    public abstract String fullNameModel();
    public abstract T[] getPosibilities();
    public abstract void setPosibilities(T[] posibilities);
    public abstract void logging();
}
