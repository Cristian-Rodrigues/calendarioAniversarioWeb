package com.senac.projetoWeb.controller;

import com.senac.projetoWeb.model.Aniversariante;
import com.senac.projetoWeb.service.AniversarianteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aniversariante")
public class ApiController {
    
    @Autowired
    AniversarianteService aniversarianteService;
    
    
    @GetMapping("/listar")
    public ResponseEntity<List> listar(){
       List<Aniversariante> listagem = aniversarianteService.listarTodos();
       return new ResponseEntity<>(listagem, HttpStatus.OK);
    } 
   
    @PostMapping("/adicionar")
    public ResponseEntity<Aniversariante> addAniversariante(@RequestBody Aniversariante aniver){
       var novoAniversariante = aniversarianteService.criar(aniver);
       return new ResponseEntity<>(novoAniversariante, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<Aniversariante> excluir(@PathVariable Integer id){
       aniversarianteService.excluir(id);
       return new ResponseEntity<>(HttpStatus.OK);
   }
    
}
