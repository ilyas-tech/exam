package com.controle.nissoul.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Offre_Emploi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String description;
    private String profil;
    private int experience;
    private String ville;
    private String Metiers;
    private String type_poste;
    private String date_fin_validite;

    @ManyToOne
    @JoinColumn(name = "id_entreprise")
    private Entreprise entreprise;

    public Offre_Emploi() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getMetiers() {
        return Metiers;
    }

    public void setMetiers(String metiers) {
        Metiers = metiers;
    }

    public String getType_poste() {
        return type_poste;
    }

    public void setType_poste(String type_poste) {
        this.type_poste = type_poste;
    }

    public String getDate_fin_validite() {
        return date_fin_validite;
    }

    public void setDate_fin_validite(String date_fin_validite) {
        this.date_fin_validite = date_fin_validite;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }
}
