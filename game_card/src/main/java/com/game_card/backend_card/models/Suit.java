package com.game_card.backend_card.models;

import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="suit", schema="deck")
public class Suit extends BaseModel<Byte, String> {

    private boolean isRed;

    public Suit(byte nameCode, Long id){
        super(id, nameCode);
        if (nameCode > 3 || nameCode < 0) {
            throw new IllegalArgumentException("Suit arguments no valide");
        } else {
                this.nameCode = nameCode;
                if (nameCode == ((byte) 1) || nameCode == ((byte) 3)) {
                    this.isRed = true;
                } else {
                    this.isRed = false;
                }
        }
        
    }

    @Override
    public String fullName() {
        switch(this.nameCode){
            case 0:
                return "clove";
            case 1:
                return "heart";
            case 2:
                return "spade";
            case 3:
                return "title";
            default:
                return "";
        }
    }

    @Override
    public Map<String, Byte> toDict() {
        return Map.of(this.fullName(), this.nameCode);
    };

}
