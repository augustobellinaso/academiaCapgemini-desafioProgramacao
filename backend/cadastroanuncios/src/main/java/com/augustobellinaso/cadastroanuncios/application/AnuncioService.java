package com.augustobellinaso.cadastroanuncios.application;

import com.augustobellinaso.cadastroanuncios.domain.anuncio.Anuncio;
import com.augustobellinaso.cadastroanuncios.domain.anuncio.AnuncioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnuncioService {

    @Autowired
    private AnuncioRepository anuncioRepository;

    public void saveAnuncio(Anuncio anuncio) {
        anuncioRepository.save(anuncio);
    }
}
