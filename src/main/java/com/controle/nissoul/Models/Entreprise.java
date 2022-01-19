package com.controle.nissoul.Models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="entreprise")
public class Entreprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String siege;
    private String email;
    private String tel;
    private String IF;
    private String rc;
    private String ice;
    private String status;
    private String nbr_offre_publie;

    public Entreprise() {
    }

    @OneToMany(targetEntity = Offre_Emploi.class,mappedBy = "title")
    private List<Offre_Emploi> offre_emplois;


    public List<Offre_Emploi> getOffre_emplois() {
        return offre_emplois;
    }

    public void setOffre_emplois(List<Offre_Emploi> offre_emplois) {
        this.offre_emplois = offre_emplois;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSiege() {
        return siege;
    }

    public void setSiege(String siege) {
        this.siege = siege;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }


    public String getRc() {
        return rc;
    }

    public void setRc(String rc) {
        this.rc = rc;
    }

    public String getIce() {
        return ice;
    }

    public void setIce(String ice) {
        this.ice = ice;
    }

    public String getIF() {
        return IF;
    }

    public void setIF(String IF) {
        this.IF = IF;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNbr_offre_publie() {
        return nbr_offre_publie;
    }

    public void setNbr_offre_publie(String nbr_offre_publie) {
        this.nbr_offre_publie = nbr_offre_publie;
    }
}
