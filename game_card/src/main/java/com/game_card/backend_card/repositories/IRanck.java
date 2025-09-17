package com.game_card.backend_card.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.game_card.backend_card.models.Ranck;

@Repository
public interface IRanck extends IBase<Ranck, Byte> {
    Optional<Byte> findByValue(Ranck ranck);
    List<Byte> findAllByValue(List<Ranck> rancks);
}
