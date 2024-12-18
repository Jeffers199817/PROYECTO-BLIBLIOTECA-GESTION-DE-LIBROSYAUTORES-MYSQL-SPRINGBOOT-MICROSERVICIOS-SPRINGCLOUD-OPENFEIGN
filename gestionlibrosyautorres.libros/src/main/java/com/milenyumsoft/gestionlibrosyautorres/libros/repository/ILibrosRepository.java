package com.milenyumsoft.gestionlibrosyautorres.libros.repository;

import com.milenyumsoft.gestionlibrosyautorres.libros.modelo.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILibrosRepository extends JpaRepository<Libro, Long> {
}
