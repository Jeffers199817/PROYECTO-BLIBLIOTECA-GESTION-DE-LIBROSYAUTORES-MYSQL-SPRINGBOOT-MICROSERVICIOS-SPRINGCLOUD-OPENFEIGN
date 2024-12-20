package com.milenyumsoft.gestionlibrosyautorres.autores.repository;

import com.milenyumsoft.gestionlibrosyautorres.autores.modelo.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAutorRepository extends JpaRepository<Autor, Long> {
}
