package com.controle.nissoul.Controller;

import com.controle.nissoul.Models.Entreprise;
import com.controle.nissoul.Services.Eservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/entreprise")
public class Entreprise_provider {

    @Autowired
    private Eservices entreprise_services;

    @PostMapping("/")
    public void save(Entreprise commande) {
        entreprise_services.save(commande);
    }

    @PutMapping("/{id}")
    public void modifier(@RequestBody Entreprise obj){
        this.entreprise_services.modifier(obj);
    }


    @GetMapping("/id/{id}")
    public Optional<Entreprise> findById(int id) {
        return entreprise_services.findById(id);
    }

    @GetMapping("/")
    public List<Entreprise> findAll() {
        return entreprise_services.findAll();
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(int id) {
        entreprise_services.deleteById(id);
    }

    @DeleteMapping("/")
    public void deleteAll() {
        entreprise_services.deleteAll();
    }

}
