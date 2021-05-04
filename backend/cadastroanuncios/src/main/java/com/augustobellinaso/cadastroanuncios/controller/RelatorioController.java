package com.augustobellinaso.cadastroanuncios.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RelatorioController {

    @GetMapping(path = "/relatorios")
    public String relatorios(){
        return "relatorios";
    }
}
