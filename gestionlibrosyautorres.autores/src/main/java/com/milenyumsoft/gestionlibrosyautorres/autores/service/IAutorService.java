package com.milenyumsoft.gestionlibrosyautorres.autores.service;

import com.milenyumsoft.gestionlibrosyautorres.autores.modelo.Autor;

import java.util.List;

public interface IAutorService {

    public void crearAutor(Autor autor);

    public void eliminarAutor(Long id);

    public List<Autor> traerAutores();

    public Autor traerAutor(Long id);

    public Autor actualizarAutor(Autor autor);


    public List<String> traerAutoresPorNombre(List<String> autores);
}
