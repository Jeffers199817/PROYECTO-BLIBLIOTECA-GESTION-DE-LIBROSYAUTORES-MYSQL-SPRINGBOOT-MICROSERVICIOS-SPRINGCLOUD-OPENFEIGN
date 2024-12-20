package com.milenyumsoft.gestionlibrosyautorres.autores.service;

import com.milenyumsoft.gestionlibrosyautorres.autores.modelo.Autor;
import com.milenyumsoft.gestionlibrosyautorres.autores.repository.IAutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService implements IAutorService {

    @Autowired
    private IAutorRepository autorRepository;

    @Override
    public void crearAutor(Autor autor) {
     autorRepository.save(autor);

    }

    @Override
    public void eliminarAutor(Long id) {
        autorRepository.delete(autorRepository.findById(id).get());
    }

    @Override
    public List<Autor> traerAutores() {
        return autorRepository.findAll();
    }

    @Override
    public Autor traerAutor(Long id) {
        return autorRepository.findById(id).get();
    }

    @Override
    public Autor actualizarAutor(Autor autor) {
        return null;
    }
}
