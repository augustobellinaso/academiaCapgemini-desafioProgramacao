package com.augustobellinaso.cadastroanuncios.domain.anuncio;

import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Anuncio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private String nomeAnuncio;

    private String nomeCliente;

    private LocalDate dataInicio;

    private LocalDate dataFinal;

    private BigDecimal investimento;

}
