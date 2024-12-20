package com.milenyumsoft.gestionlibrosyautorres.autores.service;

import com.milenyumsoft.gestionlibrosyautorres.autores.modelo.Autor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService implements IAutorService {


    @Override
    public void crearAutor(Autor autor) {

    }

    @Override
    public void eliminarAutor(Long id) {

    }

    @Override
    public List<Autor> traerAutores() {
        return List.of();
    }

    @Override
    public Autor traerAutor(Long id) {
        return null;
    }

    @Override
    public Autor actualizarAutor(Autor autor) {
        return null;
    }
}
