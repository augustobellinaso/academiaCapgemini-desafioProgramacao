package com.augustobellinaso.cadastroanuncios.controller;

import com.augustobellinaso.cadastroanuncios.application.AnuncioService;
import com.augustobellinaso.cadastroanuncios.domain.anuncio.Anuncio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/public")
public class AnuncioController {

    @Autowired
    private AnuncioService anuncioService;

    @GetMapping(path = "/cadastro/new")
    public String newCadastro(Model model) {
        model.addAttribute("anuncio", new Anuncio());
        return "anuncio-cadastro";
    }

    @PostMapping(path = "/cadastro/save")
    public String cadastrarAnuncio(@ModelAttribute("anuncio") Anuncio anuncio) {
        anuncioService.saveAnuncio(anuncio);
        return "anuncio-cadastro";
    }


}
