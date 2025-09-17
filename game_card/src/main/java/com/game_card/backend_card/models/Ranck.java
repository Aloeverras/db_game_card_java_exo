package com.game_card.backend_card.models;

import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name="ranck", schema="deck")
public class Ranck extends BaseModel<Byte, Character> {

    private byte value;
    
    public Ranck(byte nameCode, Long id) {
        super(id, nameCode);
        if (nameCode > 13) {
            throw new IllegalArgumentException("Illegal value in Ranck class");
        } else {
            // as
            if (nameCode == 1) {
                this.value = 13;
            // joker    
            } else if (nameCode == 0) {
                this.value = 0;
            } else {
                this.value = nameCode--;
            }
        }
    }

    @Override
    public String fullName() {
        if (this.nameCode == 1) {
            return "AS";
        } else if (this.nameCode == 13) {
            return "King";
        } else if (this.nameCode == 12) {
            return "Queen";
        } else if (this.nameCode == 1) {
            return "Valet";
        } else if (this.nameCode == 0){
            return "Joker";
        } else {
            return Byte.toString(this.nameCode);
        }
    }

    @Override
    public Map<Character, Byte> toDict() {
        Character keyChar = ' ';

        if (this.fullName().equals("AS")) {
            keyChar = 'A';
        } else if (this.fullName().equals("King")) {
            keyChar = 'K';
        } else if (this.fullName().equals("Queen")) {
            keyChar = 'Q';
        } else if (this.fullName().equals("Valet")) {
            keyChar = 'V';
        } else {
            keyChar = this.nameCode.toString().charAt(0);
        };

        return Map.of(keyChar, this.value);
    }

}
