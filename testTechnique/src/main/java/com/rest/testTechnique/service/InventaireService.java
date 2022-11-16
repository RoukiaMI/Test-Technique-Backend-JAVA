package com.rest.testTechnique.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.testTechnique.modele.Inventaire;
import com.rest.testTechnique.modele.Magasin;
import com.rest.testTechnique.repository.InventaireRepository;

import lombok.AllArgsConstructor;



@Service
@AllArgsConstructor

public class InventaireService {
    private final InventaireRepository inventaireRepo;
    public Inventaire creer(Inventaire p) {
		// TODO Auto-generated method stub
		return inventaireRepo.save(p);
	}

	
	public Inventaire modifier(long id, Inventaire p) {
		// TODO Auto-generated method stub
		return inventaireRepo.findById(id).map(ps-> {ps.setMagasin(p.getMagasin());
				ps.setMaterial(p.getMaterial());
		
		return inventaireRepo.save(p);
		}).orElseThrow(()->new RuntimeException("product no found"));
	}

	public String supprimer(Inventaire p) {
		// TODO Auto-generated method stub
		Magasin magasinid=p.getMagasin();
        String mId=magasinid.getVille();

		long id=p.getInventaire_id();
		inventaireRepo.deleteById(p.getInventaire_id());
		
		return "Le produit numero "+id+" de nom"+mId+" a ete supprimer !";
	}

	
	public List<Inventaire> lire() {
		// TODO Auto-generated method stub
		return inventaireRepo.findAll();
	}
}
