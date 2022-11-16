package com.rest.testTechnique.controller;

import org.springframework.web.bind.annotation.PostMapping;

import com.rest.testTechnique.modele.Categorie;
import com.rest.testTechnique.service.CategorieService;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import lombok.AllArgsConstructor;
@RestController
@RequestMapping("/api/v1/Categorie")
@AllArgsConstructor
public class CategorieController {
    private final CategorieService serviceCategorie;

    @PostMapping("/create")
    public Categorie creer(@RequestBody Categorie p){
        return serviceCategorie.creer(p);
    }

}
