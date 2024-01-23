package com.senac.projetoWeb.controller;

import org.springframework.ui.Model;
import com.senac.projetoWeb.model.Aniversariante;
import com.senac.projetoWeb.service.AniversarianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AniversarianteController {
    
    @Autowired
    AniversarianteService aniversarianteService;
    
    @GetMapping("/inicio") 
    public String inicio() {      
        return "index"; 
    }
    
    @GetMapping("/listagem")
    public String listaForm(Model model) {
        model.addAttribute("lista", aniversarianteService.listarTodos());
        return "lista"; 
    }
    
    @PostMapping("/gravar")
    public String salvando(@ModelAttribute Aniversariante aniversariante, Model model) {
        aniversarianteService.criar(aniversariante);
        return "redirect:/listagem";
    }
    
}

