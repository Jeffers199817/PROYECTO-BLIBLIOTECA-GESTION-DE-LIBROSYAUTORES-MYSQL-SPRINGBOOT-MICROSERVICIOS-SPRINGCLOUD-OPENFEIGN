package com.milenyumsoft.gestionlibrosyautorres.autores.repository;

import com.milenyumsoft.gestionlibrosyautorres.autores.modelo.Autor;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutorRepository extends JpaRepository<Autor, Long> {


    @Query("SELECT a FROM Autor a WHERE a.nombre = :nombre")
    public Autor traerAutorPorNombre(@Param("nombre") String nombre);

}
