package com.rest.testTechnique.service;

import org.springframework.stereotype.Service;

import com.rest.testTechnique.modele.Categorie;
import com.rest.testTechnique.repository.CategorieRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategorieService {
    private final CategorieRepository categorieRepo;
    public Categorie creer(Categorie c) {
		
		return categorieRepo.save(c);
	}
}
