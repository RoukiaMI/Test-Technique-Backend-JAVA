package com.rest.testTechnique.controller;

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


import com.rest.testTechnique.modele.Inventaire;
import com.rest.testTechnique.service.InventaireService;


import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/Inventaire")
@AllArgsConstructor
public class InventaireController {

    private final InventaireService serviceInventaire;

    @PostMapping("/create")
    public Inventaire creer(@RequestBody Inventaire p){
        return serviceInventaire.creer(p);
    }

    @GetMapping
    public List<Inventaire> read(){
        return  serviceInventaire.lire();
    }

    @PutMapping("/modify/{id}")
    public Inventaire modify(@PathVariable long id, @RequestBody Inventaire p){
        return serviceInventaire.modifier(id, p);
    }

    @DeleteMapping("/deleteProduct")
    public String delete(@RequestBody Inventaire p){
        return serviceInventaire.supprimer(p);
    }
}