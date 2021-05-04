package com.augustobellinaso.cadastroanuncios.controller;

import com.augustobellinaso.cadastroanuncios.domain.anuncio.Anuncio;
import com.augustobellinaso.cadastroanuncios.domain.anuncio.AnuncioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RelatorioController {

    @Autowired
    private AnuncioRepository anuncioRepository;

    @GetMapping(path = "/relatorios")
    public String relatorios(Model model){
        List<Anuncio> anuncios = anuncioRepository.findAll();

        model.addAttribute("anuncios", anuncios);

        return "relatorios";
    }
}
