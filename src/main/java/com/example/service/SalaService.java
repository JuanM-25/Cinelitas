package com.example.service;

import com.example.entity.Sala;
import com.example.repository.SalaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Juan Diego
 */
@Service
public class SalaService implements ISalaService {

    @Autowired
    private SalaRepository salaRepository;

    @Override
    public List<Sala> listSala() {
        return (List<Sala>) salaRepository.findAll();
    }
}
