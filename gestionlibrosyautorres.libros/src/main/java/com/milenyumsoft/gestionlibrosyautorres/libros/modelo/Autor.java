package com.milenyumsoft.gestionlibrosyautorres.libros.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Autor {

    private Long idAutor;
    private String nombre;
    private String nacionalidad;
    private LocalDate fechaNacimiento;
    private List<String> idLibros;


}
