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
import java.time.Period;

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
    private BigDecimal investimentoDia;


    public int totalInvestido() {
        int dias = Period.between(dataInicio, dataFinal).getDays();
        return dias * investimentoDia.intValue();
    }
    //Métodos da classe
    public int qtdeMaximaVisualizacoes() {
        int visualizacoes = 0;
        int visualizacoesOriginais = visualizacoesAnuncioOriginal(totalInvestido());
        visualizacoes += visualizacoesOriginais;

        int cliques = 0;
        int compartilhamentos = 0;
        int novasVisualizacoes = 0;

        for (int i = 1; i <= 4; i++) {
            cliques = qtdeCliques(visualizacoes);
            compartilhamentos = qtdeCompartilhamento(cliques);
            novasVisualizacoes = compartilhamentos * 40;
            visualizacoes += novasVisualizacoes;
        }
        return visualizacoes;
    }

    //Método para obter o número de visualizações do anúncio original
    public int visualizacoesAnuncioOriginal(int valorInvestido) {
        int visualizacoes = 0;

        for (int i = 1; i <= valorInvestido; i++) {
            visualizacoes += 30;
        }
        return visualizacoes;
    }

    //Quantidade de cliques baseado na quantidade de visualizações
    public int qtdeCliques(int visualizacoes) {
        return (visualizacoes / 100) * 12;
    }

    //Quantidade de compartilhamentos a partir da quantidade de cliques
    public int qtdeCompartilhamento(int cliques) {
        return (cliques / 20) * 3;
    }

    public int cliquesTotais() {
        return (qtdeMaximaVisualizacoes() / 100) * 12;
    }

    public int compartilhamentosTotais() {
        return (cliquesTotais() / 20) * 3;
    }


}
