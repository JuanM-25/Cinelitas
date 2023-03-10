package com.example.service;

import com.example.entity.Pelicula;
import java.util.List;

/**
 *
 * @author Juan Diego
 */
public interface IPeliculaService {

    public List<Pelicula> getAllPelicula();

    public Pelicula getPeliculaById(long id);

    public void savePelicula(Pelicula pelicula);

    public void delete(long id);
}
