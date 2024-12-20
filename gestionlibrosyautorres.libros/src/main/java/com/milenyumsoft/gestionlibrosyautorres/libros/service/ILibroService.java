package com.milenyumsoft.gestionlibrosyautorres.libros.service;

import com.milenyumsoft.gestionlibrosyautorres.libros.modelo.Libro;

import java.util.List;

public interface ILibroService {

    //Crear
    public String crearLibro(Libro libro);

    //Eliminar
    public void eliminarLibro(Long id);

    //Traer todos los libros
    public List<Libro> traerLibros();

    //Traer un libro por id
    public Libro traerLibro(Long id);

    //Actualizar un libro

    public Libro actualizarLibro(Libro libro);
}
