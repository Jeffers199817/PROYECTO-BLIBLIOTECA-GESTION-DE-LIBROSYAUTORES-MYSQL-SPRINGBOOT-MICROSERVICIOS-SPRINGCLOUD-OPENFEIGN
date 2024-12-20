package com.milenyumsoft.gestionlibrosyautorres.libros.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LibroDTO {

  private Long idLibro;
  private List<String> listaAutores = new ArrayList<>();
}
