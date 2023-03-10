package com.example.repository;

import com.example.entity.Sala;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Juan Diego
 */
@Repository
public interface SalaRepository extends CrudRepository<Sala, Long>{
    
}
