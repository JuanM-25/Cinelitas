package com.example.repository;

import com.example.entity.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Juan Diego
 */
@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula, Long> {
    
}
