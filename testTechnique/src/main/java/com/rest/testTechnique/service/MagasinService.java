package com.rest.testTechnique.service;
import org.springframework.stereotype.Service;

import com.rest.testTechnique.modele.Magasin;
import com.rest.testTechnique.repository.MagasinRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MagasinService {
    private final MagasinRepository MagasinRepo;
    public Magasin creer(Magasin m) {
		
		return MagasinRepo.save(m);
	}
}
