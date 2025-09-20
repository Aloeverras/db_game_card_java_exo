package com.game_card.backend_card.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Entity
@Table(name="card", schema="deck")
public class Card {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private final Long ID;
    private final Suit SUIT;
    private final Ranck RANCK;

    @ManyToOne
    @JoinColumn(name="suit_id")
    private final Suit SUIT_COLOR;

    @ManyToOne
    @JoinColumn(name="ranck_id")
    private final Ranck RANCK_VALUE;
}
