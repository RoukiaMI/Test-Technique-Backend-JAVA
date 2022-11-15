package com.rest.testTechnique.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.testTechnique.modele.Magasin;
import com.rest.testTechnique.service.MagasinService;

import org.springframework.web.bind.annotation.PostMapping;
import lombok.AllArgsConstructor;
@RestController
@RequestMapping("/api/v1/Magasin")
@AllArgsConstructor
public class MagasinController {
    private final MagasinService serviceMagasin;

    @PostMapping("/create")
    public Magasin creer(@RequestBody Magasin p){
        return serviceMagasin.creer(p);
    }
}
