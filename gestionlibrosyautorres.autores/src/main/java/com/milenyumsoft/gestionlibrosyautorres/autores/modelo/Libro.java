package com.milenyumsoft.gestionlibrosyautorres.autores.modelo;

import java.time.LocalDate;
import java.util.List;

public class Libro {

    private Long idLibro;
    private Long numeroISBN;
    private Long titulo;
    private LocalDate fechaPublicacion;
    private String descripcion;
    private List<String> listaAutores;
}
