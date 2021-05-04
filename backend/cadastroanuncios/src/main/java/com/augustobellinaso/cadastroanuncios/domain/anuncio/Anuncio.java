package com.augustobellinaso.cadastroanuncios.domain.anuncio;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
public class Anuncio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    @NotBlank(message = "O nome do anúncio deve ser preenchido")
    private String nomeAnuncio;

    @NotBlank(message = "O nome do cliente deve ser preenchido")
    private String nomeCliente;

    @NotBlank(message = "A data de início do anúncio deve ser preenchida")
    private String dataInicio;

    @NotBlank(message = "A data de término do anúncio deve ser preenchida")
    private String dataFinal;

    @NotNull(message = "O valor do investimento deve ser preenchido")
    private BigDecimal investimento;

}
