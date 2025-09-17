package com.game_card.backend_card.models;

import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Entity
@Table(name = "card", schema = "deck")
public class Card extends BaseModel<Byte[], String> {

    private Ranck ranck;
    private Suit suit;

    public Card(Long id, Byte[] nameCode){
        super(id, nameCode);
        this.nameCode = new Byte[2];
        // 0 = color
        this.nameCode[0] = this.suit.getNameCode();
        // 1 == rank
        this.nameCode[1] = this.ranck.getNameCode();
    }

    @Override
    public String fullName() {
        return this.suit.fullName() + " " + this.ranck.fullName();
    }

    @Override
    public Map<String, Byte[]> toDict() {
        return Map.of(this.fullName(), this.nameCode);
    }

}
