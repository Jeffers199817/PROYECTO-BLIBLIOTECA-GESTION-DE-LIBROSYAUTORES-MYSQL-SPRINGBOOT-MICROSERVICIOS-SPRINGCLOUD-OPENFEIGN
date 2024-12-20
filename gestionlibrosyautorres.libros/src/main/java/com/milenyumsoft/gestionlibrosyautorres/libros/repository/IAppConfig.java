package com.milenyumsoft.gestionlibrosyautorres.libros.repository;

import com.milenyumsoft.gestionlibrosyautorres.libros.dto.LibroDTO;
import com.milenyumsoft.gestionlibrosyautorres.libros.modelo.Autor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "gestionlibrosyautorres.autor", url = "http://localhost:9002")
public interface IAppConfig {


    @GetMapping("/api/traer/autor/{id}")
    public Autor traerAutor(@PathVariable Long id);

    @PostMapping("/api/autor/traerAutoresPorNombre")
    public List<String> traerAutores(@RequestBody List<String> autores);



}
