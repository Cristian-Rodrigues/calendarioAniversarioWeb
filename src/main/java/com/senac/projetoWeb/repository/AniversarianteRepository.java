package com.senac.projetoWeb.repository;

import com.senac.projetoWeb.model.Aniversariante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AniversarianteRepository extends JpaRepository<Aniversariante,Integer> {
    
}
