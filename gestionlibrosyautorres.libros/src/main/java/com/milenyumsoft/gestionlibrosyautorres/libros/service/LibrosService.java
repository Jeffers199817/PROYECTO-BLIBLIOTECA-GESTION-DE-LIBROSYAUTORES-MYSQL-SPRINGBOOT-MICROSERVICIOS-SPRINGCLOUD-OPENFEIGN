package com.milenyumsoft.gestionlibrosyautorres.libros.service;

import com.milenyumsoft.gestionlibrosyautorres.libros.modelo.Libro;
import com.milenyumsoft.gestionlibrosyautorres.libros.repository.ILibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibrosService implements ILibrosService {

    @Autowired
    private ILibrosRepository librosRepository;


    @Override
    public void crearLibro(Libro libro) {

    }

    @Override
    public void eliminarLibro(Long id) {

    }

    @Override
    public List<Libro> traerLibros() {
        return List.of();
    }

    @Override
    public Libro traerLibro(Long id) {
        return null;
    }

    @Override
    public Libro actualizarLibro(Libro libro) {
        return null;
    }
}
