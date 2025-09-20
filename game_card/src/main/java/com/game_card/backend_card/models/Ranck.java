package com.game_card.backend_card.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Entity
@Table(name="ranck", schema="deck")
public class Ranck {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private final Long ID;
    private final char RANCK_NAME;

    @OneToMany(mappedBy="ranck", cascade = CascadeType.ALL)
    private final List<Card> CARDS;
}
