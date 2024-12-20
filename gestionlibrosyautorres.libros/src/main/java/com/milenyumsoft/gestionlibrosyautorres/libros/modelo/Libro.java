package com.milenyumsoft.gestionlibrosyautorres.libros.modelo;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLibro;

    private Long numeroISBN;
    private String titulo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaPublicacion;
    private String descripcion;
    @ElementCollection
    private List<String> listaAutres;

}
