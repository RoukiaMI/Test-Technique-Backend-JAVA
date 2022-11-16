package com.rest.testTechnique.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.testTechnique.modele.Material;

import com.rest.testTechnique.service.MaterialService;


import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/Material")
@AllArgsConstructor
public class MaterialController {

    private final MaterialService serviceMaterial;

    @PostMapping("/create")
    public Material creer(@RequestBody Material p){
        return serviceMaterial.creer(p);
    }

    @GetMapping
    public List<Material> read(){
        return  serviceMaterial.lire();
    }

    @PutMapping("/modify/{id}")
    public Material modify(@PathVariable long id, @RequestBody Material p){
        return serviceMaterial.modifier(id, p);
    }

    @DeleteMapping("/deleteProduct")
    public String delete(@RequestBody Material p){
        return serviceMaterial.supprimer(p);
    }
}
