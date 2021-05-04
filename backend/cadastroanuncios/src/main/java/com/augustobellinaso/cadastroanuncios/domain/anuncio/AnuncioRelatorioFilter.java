package com.augustobellinaso.cadastroanuncios.domain.anuncio;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class AnuncioRelatorioFilter {

    private String nomeCliente;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataInicio;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataFinal;
}
