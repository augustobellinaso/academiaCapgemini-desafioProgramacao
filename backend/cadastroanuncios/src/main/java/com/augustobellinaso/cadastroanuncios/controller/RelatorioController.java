package com.augustobellinaso.cadastroanuncios.controller;

import com.augustobellinaso.cadastroanuncios.application.RelatorioService;
import com.augustobellinaso.cadastroanuncios.domain.anuncio.Anuncio;
import com.augustobellinaso.cadastroanuncios.domain.anuncio.AnuncioRelatorioFilter;
import com.augustobellinaso.cadastroanuncios.domain.anuncio.AnuncioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class RelatorioController {

    @Autowired
    private AnuncioRepository anuncioRepository;

    @Autowired
    private RelatorioService relatorioService;

    @GetMapping(path = "/relatorios")
    public String relatorios(@ModelAttribute("anuncioRelatorioFilter") AnuncioRelatorioFilter filter,
                             Model model){

        List<Anuncio> anuncios = anuncioRepository.findAll();
        //List<Anuncio> anuncios = relatorioService.listAnuncios(filter);
        model.addAttribute("anuncios", anuncios);

        model.addAttribute("filter", filter);

        return "relatorios";
    }
}
