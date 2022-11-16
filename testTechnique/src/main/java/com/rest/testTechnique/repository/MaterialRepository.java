package com.rest.testTechnique.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.testTechnique.modele.Material;
public interface MaterialRepository extends JpaRepository<Material,Long>{
    
}
