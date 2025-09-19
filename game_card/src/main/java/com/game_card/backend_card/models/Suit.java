package com.game_card.backend_card.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name="suit", schema="deck")
public class Suit extends BaseModel<Character>{

    public Suit(Long id, Character nameModel) {
        super(id, nameModel);
        
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public Character getNameModel() {
        return this.nameModel;
    }

    @Override
    public String fullNameModel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fullNameModel'");
    }

}
