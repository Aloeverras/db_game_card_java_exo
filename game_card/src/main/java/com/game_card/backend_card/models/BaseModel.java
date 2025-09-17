package com.game_card.backend_card.models;

import java.util.Map;

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
public abstract class BaseModel<T, K> {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected Long id;
    protected T nameCode;

    public abstract String fullName();

    public abstract Map<K, T> toDict();
}