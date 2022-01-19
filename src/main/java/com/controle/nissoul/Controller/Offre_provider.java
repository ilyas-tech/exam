package com.controle.nissoul.Controller;


import com.controle.nissoul.Models.Offre_Emploi;
import com.controle.nissoul.Services.Oservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/offre")
public class Offre_provider {

    @Autowired
    private Oservices offre_services;

    @PostMapping("/")
    public void save(Offre_Emploi commande) {
        offre_services.save(commande);
    }

    @PutMapping("/{id}")
    public void modifier(@RequestBody Offre_Emploi obj){
        this.offre_services.modifier(obj);
    }


    @GetMapping("/id/{id}")
    public Optional<Offre_Emploi> findById(int id) {
        return offre_services.findById(id);
    }

    @GetMapping("/")
    public List<Offre_Emploi> findAll() {
        return offre_services.findAll();
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(int id) {
        offre_services.deleteById(id);
    }

    @DeleteMapping("/")
    public void deleteAll() {
        offre_services.deleteAll();
    }

}
