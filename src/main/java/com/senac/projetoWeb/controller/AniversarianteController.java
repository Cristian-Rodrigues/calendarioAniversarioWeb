package com.senac.projetoWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AniversarianteController {
    
    @GetMapping("/inicio") 
    public String inicio() {      
        return "index"; 
    }
    
    @GetMapping("/listagem")
    public String listaForm( ) {
        return "lista"; 
    }
    
}

