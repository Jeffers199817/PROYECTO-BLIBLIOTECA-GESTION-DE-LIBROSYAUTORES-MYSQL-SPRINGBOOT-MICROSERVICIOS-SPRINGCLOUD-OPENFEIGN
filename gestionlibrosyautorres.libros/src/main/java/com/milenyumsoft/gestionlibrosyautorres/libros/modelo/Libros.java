package com.milenyumsoft.gestionlibrosyautorres.libros.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Libros{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLibros;

    private Long numeroISBN;
    private String titulo;
    private LocalDate fechaPublicacion;
    private String descripcion;
    @ElementCollection
    private List<String> listaAutres;

}
