package com.rest.testTechnique.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.testTechnique.modele.Categorie;
public interface CategorieRepository extends JpaRepository<Categorie, Long>{
    
}
