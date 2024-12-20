package com.milenyumsoft.gestionlibrosyautorres.libros.controller;

import com.milenyumsoft.gestionlibrosyautorres.libros.modelo.Libro;
import com.milenyumsoft.gestionlibrosyautorres.libros.service.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libro")
public class LibroController {

    @Autowired
    private ILibroService librosService;


    @GetMapping("/traerLibros")
    public List<Libro> traerLibros(){
        return librosService.traerLibros();
    }

    @GetMapping("/traerLibro/{id}")
    public Libro traerLibro(@PathVariable Long id){
        return librosService.traerLibro(id);
    }

    @PostMapping("/crearLibro")
    public String crearLibro(Libro libro){
        librosService.crearLibro(libro);
        return "Libro creado correctamente";


    }

    @DeleteMapping("/eliminarLibro/{id}")
    public String eliminarLibro(@PathVariable Long id){
        librosService.eliminarLibro(id);
        return "Libro eliminado correctamente";
    }

    @PutMapping("/actualizarLibro")
    public String actualizarLibro(Libro libro){
       Libro lib= librosService.actualizarLibro(libro);
        return "Libro actualizado correctamente" + lib.toString();
    }




}