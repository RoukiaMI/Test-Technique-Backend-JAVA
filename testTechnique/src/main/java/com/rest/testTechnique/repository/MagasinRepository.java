package com.rest.testTechnique.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.testTechnique.modele.Magasin;
public interface MagasinRepository extends JpaRepository<Magasin,Long>{
    
}
