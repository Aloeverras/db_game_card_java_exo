package com.game_card.backend_card.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.game_card.backend_card.models.Ranck;

@Repository
public interface RanckRepository extends JpaRepository<Ranck, Long> {
    Ranck findRanckByRanckName(char ranckName);
    List<Ranck> findAllRanckByRanckNames(List<Character> ranckNames);
}
