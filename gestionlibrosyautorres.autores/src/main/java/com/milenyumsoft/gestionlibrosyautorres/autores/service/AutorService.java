package com.milenyumsoft.gestionlibrosyautorres.autores.service;

import com.milenyumsoft.gestionlibrosyautorres.autores.modelo.Autor;
import com.milenyumsoft.gestionlibrosyautorres.autores.repository.IAutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutorService implements IAutorService {

    @Autowired
    private IAutorRepository autorRepository;

    @Override
    public void crearAutor(Autor autor) {

        System.out.println("Autor: " + autor.toString());
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

       Autor aut= this.traerAutor(autor.getIdAutor());
         aut.setNombre(autor.getNombre());
            aut.setFechaNacimiento(autor.getFechaNacimiento());
            aut.setIdLibros(autor.getIdLibros());
            this.crearAutor(aut);
        return aut;
    }

    @Override
    public List<String> traerAutoresPorNombre(List<String> autores) {

        List<String> autoresExistentes= new ArrayList<>();
        for(String autor: autores){
          Autor aut=  autorRepository.traerAutorPorNombre(autor);
            if(aut!=null){
                autoresExistentes.add(aut.getNombre());
            }
        }

        return autoresExistentes;
    }
}
