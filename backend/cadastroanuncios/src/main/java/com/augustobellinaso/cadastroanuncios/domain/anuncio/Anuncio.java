package com.augustobellinaso.cadastroanuncios.domain.anuncio;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
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
    @Column
    private Integer id;

    @NotBlank(message = "O nome do anúncio deve ser preenchido")
    @Column
    private String nomeAnuncio;

    @NotBlank(message = "O nome do cliente deve ser preenchido")
    @Column
    private String nomeCliente;

    @NotNull(message = "A data de início do anúncio deve ser preenchida")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column
    private LocalDate dataInicio;

    @NotNull(message = "A data de término do anúncio deve ser preenchida")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column
    private LocalDate dataFinal;

    @NotNull(message = "O valor do investimento deve ser preenchido")
    @Column
    private BigDecimal investimento;

}
