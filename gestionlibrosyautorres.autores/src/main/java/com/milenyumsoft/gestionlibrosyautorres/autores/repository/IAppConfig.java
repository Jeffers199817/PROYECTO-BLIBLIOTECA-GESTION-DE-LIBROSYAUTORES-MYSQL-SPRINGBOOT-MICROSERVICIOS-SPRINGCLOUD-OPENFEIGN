package com.milenyumsoft.gestionlibrosyautorres.autores.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name= "gestionlibrosyautorres.libro", url = "http://localhost:9002")
public interface IAppConfig {

        @GetMapping("/api/traer/libro/{id}")
        public String traerLibro(@PathVariable Long id);
}
