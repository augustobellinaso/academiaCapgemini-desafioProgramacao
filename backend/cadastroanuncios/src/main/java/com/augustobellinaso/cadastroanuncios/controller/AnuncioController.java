package com.augustobellinaso.cadastroanuncios.controller;

import com.augustobellinaso.cadastroanuncios.domain.anuncio.Anuncio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnuncioController {

    @GetMapping(path = {"/", "/index"})
    public String index(Model model) {
        model.addAttribute("anuncio", new Anuncio());
        return "index";
    }
}
