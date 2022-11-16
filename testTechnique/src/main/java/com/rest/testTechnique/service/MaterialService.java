package com.rest.testTechnique.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.testTechnique.modele.Material;
import com.rest.testTechnique.repository.MaterialRepository;

import lombok.AllArgsConstructor;



@Service
@AllArgsConstructor

public class MaterialService {
    private final MaterialRepository repo;
	public Material creer(Material p) {
		// TODO Auto-generated method stub
		return repo.save(p);
	}

	
	public Material modifier(long id, Material p) {
		// TODO Auto-generated method stub
		return repo.findById(id).map(ps-> {
            ps.setName(p.getName());
            ps.setImage(p.getImage());
            ps.setDescrip(p.getDescrip());
            ps.setCout_remplacement(p.getCout_remplacement());
            ps.setCou_location(p.getCou_location());
            ps.setDuree_location(p.getDuree_location());
            ps.setTaille(p.getTaille());
		return repo.save(p);
		}).orElseThrow(()->new RuntimeException("product no found"));
	}

	public String supprimer(Material p) {
		// TODO Auto-generated method stub
		String nom=p.getName();
		long id=p.getMaterial_id();
		repo.deleteById(id);
		
		return "Le produit numero "+id+" de nom"+nom+" a ete supprimer !";
	}

	
	public List<Material> lire() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
