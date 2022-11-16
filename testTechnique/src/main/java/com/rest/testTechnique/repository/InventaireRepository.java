package com.rest.testTechnique.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.testTechnique.modele.Inventaire;

public interface InventaireRepository extends JpaRepository<Inventaire,Long>{
    
}
