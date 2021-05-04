package com.augustobellinaso.cadastroanuncios.application;

import com.augustobellinaso.cadastroanuncios.domain.anuncio.Anuncio;
import com.augustobellinaso.cadastroanuncios.domain.anuncio.AnuncioRelatorioFilter;
import com.augustobellinaso.cadastroanuncios.domain.anuncio.AnuncioRepository;
import org.apache.tomcat.jni.Local;
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

        if (!(nome == "")) {
            return anuncioRepository.findByNomeCliente(nome);
        }

        LocalDate dataInicial = filter.getDataInicio();
        LocalDate dataFinal = filter.getDataFinal();

        if (dataInicial == null) {
            return List.of();
        }

        if (dataFinal == null) {
            dataFinal = LocalDate.now();
        }

        return anuncioRepository.findAll();
    }
}
