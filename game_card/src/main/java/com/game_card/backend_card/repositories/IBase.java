package com.game_card.backend_card.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IBase<T, C> extends JpaRepository<T, Long> {
    Optional<T> findByCodename(C codeName);
    List<T> findAllByCodename(List<C> codeNames);
};