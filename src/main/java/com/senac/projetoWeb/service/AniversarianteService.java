package com.senac.projetoWeb.service;

import com.senac.projetoWeb.model.Aniversariante;
import com.senac.projetoWeb.repository.AniversarianteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AniversarianteService {
    
    @Autowired
    AniversarianteRepository aniversarianteRepository; 
       
    
    public List<Aniversariante> listarTodos(){
        return aniversarianteRepository.findAll();
    }
      
    public Aniversariante buscarPorId(Integer id){
        return aniversarianteRepository.findById(id).orElseThrow();
    }
    
    public void excluir(Integer id){
        Aniversariante aniversarianteEncontrado = buscarPorId(id);
        aniversarianteRepository.deleteById(aniversarianteEncontrado.getId());
    }
    
    public Aniversariante criar(Aniversariante aniver){
        aniver.setId(null);
        aniversarianteRepository.save(aniver);
        return aniver;
    }
}
