package com.milenyumsoft.gestionlibrosyautorres.libros.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "gestionlibrosyautorres.autor", url = "http://localhost:9001")
public interface IAppConfig {


    @GetMapping("/api/traer/autor/{id}")
    public String traerAutor(@PathVariable Long id);

}
