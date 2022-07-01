package com.prueba1.repository;

import com.prueba1.entity.Artista;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Karina Madrigal
 */

@Repository
public interface ArtistaRepository extends CrudRepository<Artista, Long> {
    
}
