package com.milenyumsoft.gestionlibrosyautorres.libros.service;

import com.milenyumsoft.gestionlibrosyautorres.libros.modelo.Libro;

import java.util.List;

public interface ILibrosService {

    //Crear
    public void crearLibro();

    //Traer todos los libros
    public List<Libro> traerLibros();

    //Traer un libro por id
    public Libro traerLibro(Long id);

    //Actualizar un libro

    public Libro actualizarLibro(Long id);
}
