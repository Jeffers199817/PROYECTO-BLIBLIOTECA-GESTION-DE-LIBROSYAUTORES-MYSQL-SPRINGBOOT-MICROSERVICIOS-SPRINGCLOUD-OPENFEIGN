package com.milenyumsoft.gestionlibrosyautorres.autores.repository;

import com.milenyumsoft.gestionlibrosyautorres.autores.modelo.Autor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name= "gestionlibrosyautorres.libro", url = "http://localhost:9002")
public interface IAppConfig {

        @GetMapping("/api/traer/libro/{id}")
        public String traerLibro(@PathVariable Long id);

        @GetMapping("/api/traer/libros/")
        public List<Autor> traerLibros(@RequestBody Autor autor);

}
