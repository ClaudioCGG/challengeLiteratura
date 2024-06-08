package com.alura.challenge_literatura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ResultadoDatos(
        @JsonAlias("results") List<DatosLibro> resultados
) {
}
