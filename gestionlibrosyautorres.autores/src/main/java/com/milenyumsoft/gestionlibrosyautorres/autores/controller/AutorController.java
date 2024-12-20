package com.milenyumsoft.gestionlibrosyautorres.autores.controller;

import com.milenyumsoft.gestionlibrosyautorres.autores.modelo.Autor;
import com.milenyumsoft.gestionlibrosyautorres.autores.service.IAutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/autor")
public class AutorController {

    @Autowired

    private IAutorService autorService;

    @GetMapping("/traerAutores")
    public List<Autor> traerAutores(){
        return autorService.traerAutores();
    }

    @GetMapping("/traerAutor/{id}")
    public Autor traerAutor(@PathVariable Long id){
        return autorService.traerAutor(id);
    }

    @PostMapping("/crearAutor")
    public String crearAutor(@RequestBody Autor autor){
        autorService.crearAutor(autor);
        System.out.println("Autor: " + autor.getNombre());
        System.out.println("Autor: " + autor.toString());
        return "Autor creado correctamente";
    }

    @DeleteMapping("/eliminarAutor/{id}")
    public String eliminarAutor(@PathVariable Long id){
        autorService.eliminarAutor(id);
        return "Autor eliminado correctamente";
    }

    @PutMapping("/actualizarAutor")
    public String actualizarAutor(@RequestBody Autor autor){
        Autor aut= autorService.actualizarAutor(autor);
        return "Autor actualizado correctamente" + aut.toString();
    }

    @PostMapping("/traerAutoresPorNombre")
    public List<String> traerAutoresPorNombre(@RequestBody List<String> autores){
        return autorService.traerAutoresPorNombre(autores);
    }
}
