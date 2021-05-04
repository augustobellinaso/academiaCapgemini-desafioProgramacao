package com.augustobellinaso.cadastroanuncios.application;

import com.augustobellinaso.cadastroanuncios.domain.anuncio.Anuncio;
import com.augustobellinaso.cadastroanuncios.domain.anuncio.AnuncioRelatorioFilter;
import com.augustobellinaso.cadastroanuncios.domain.anuncio.AnuncioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class RelatorioService {

    @Autowired
    private AnuncioRepository anuncioRepository;

    public List<Anuncio> listAnuncios(AnuncioRelatorioFilter filter) {

        String nome = filter.getNomeCliente();

        if (nome != null && !nome.equals("")) {
            return anuncioRepository.findByNomeCliente(nome);
        }

        LocalDate dataInicial = filter.getDataInicio();
        if (dataInicial != null) {
            return anuncioRepository.findByDataInicio(dataInicial);
        }

        LocalDate dataFinal = filter.getDataFinal();
        if (dataFinal != null){
            return anuncioRepository.findByDataFinal(dataFinal);
        }

        return anuncioRepository.findAll();
    }
}
