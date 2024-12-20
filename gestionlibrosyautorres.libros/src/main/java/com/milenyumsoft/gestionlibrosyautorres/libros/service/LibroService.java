package com.milenyumsoft.gestionlibrosyautorres.libros.service;

import com.milenyumsoft.gestionlibrosyautorres.libros.dto.LibroDTO;
import com.milenyumsoft.gestionlibrosyautorres.libros.modelo.Autor;
import com.milenyumsoft.gestionlibrosyautorres.libros.modelo.Libro;
import com.milenyumsoft.gestionlibrosyautorres.libros.repository.IAppConfig;
import com.milenyumsoft.gestionlibrosyautorres.libros.repository.ILibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibroService implements ILibroService {

    @Autowired
    private ILibroRepository libroRepository;
    @Autowired
    private IAppConfig appConfig;


    @Override
    public String crearLibro(Libro libro) {



       List<String> listaAutors= appConfig.traerAutores(libro.getListaAutores());

       List<String> listaAutoresRequest= libro.getListaAutores();

       List<String> autoresNOExistentes= new ArrayList<>();

       if(listaAutors.isEmpty()){
           String respuesta= "No se puede crear el libro, no existe ningun autor de la lista";
            return respuesta;

       }
       if(!listaAutors.isEmpty()){

              for(String autor: listaAutoresRequest){
                    if(!listaAutors.contains(autor)){
                        autoresNOExistentes.add(autor);
                    }
              }

              //Si hay autores que no existen, se retorna un mensaje con los autores que no existen
                if(!autoresNOExistentes.isEmpty()){
                    String respuestaAutoresNoExistentes= "Autores que no existen: " + autoresNOExistentes.toString();
                }
       }

        libro.getListaAutores().addAll(listaAutors);

        libroRepository.save(libro);
       String respuesta = "Libro creado correctamente , con los autores existentes"+ listaAutors.toString() + " y los autores no existentes: " + autoresNOExistentes.toString();

        return respuesta;

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


            this.crearLibro(lib);


        return lib;
    }
}
