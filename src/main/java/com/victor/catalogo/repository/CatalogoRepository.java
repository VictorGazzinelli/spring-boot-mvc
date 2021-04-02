package com.victor.catalogo.repository;

import com.victor.catalogo.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogoRepository extends JpaRepository<Musica, Long> {
    
}