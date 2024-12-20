package com.milenyumsoft.gestionlibrosyautorres.libros.service;

import com.milenyumsoft.gestionlibrosyautorres.libros.modelo.Libro;
import com.milenyumsoft.gestionlibrosyautorres.libros.repository.ILibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService implements ILibroService {

    @Autowired
    private ILibroRepository libroRepository;


    @Override
    public void crearLibro(Libro libro) {
        libroRepository.save(libro);

    }

    @Override
    public void eliminarLibro(Long id) {

        libroRepository.delete(libroRepository.findById(id).get());

    }

    @Override
    public List<Libro> traerLibros() {
        return libroRepository.findAll();
    }

    @Override
    public Libro traerLibro(Long id) {
        return libroRepository.findById(id).get();
    }

    @Override
    public Libro actualizarLibro(Libro libro) {

       Libro lib = this.traerLibro(libro.getIdLibro());

       lib.setTitulo(libro.getTitulo());
         lib.setNumeroISBN(libro.getNumeroISBN());
            lib.setFechaPublicacion(libro.getFechaPublicacion());
            lib.setDescripcion(libro.getDescripcion());
            lib.setListaAutres(libro.getListaAutres());

            this.crearLibro(lib);


        return lib;
    }
}
