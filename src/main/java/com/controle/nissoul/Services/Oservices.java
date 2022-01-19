package com.controle.nissoul.Services;

import com.controle.nissoul.Dao.Odao;
import com.controle.nissoul.Models.Offre_Emploi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Oservices {

    @Autowired
    private Odao offre;

    public List<Offre_Emploi> findAll() {
        return offre.findAll();
    }

    public int save(Offre_Emploi ofp) {
        // offre.save(ofp);
        if(ofp == null ) return  -1;
        else{
            offre.save(ofp);
            return 1;
        }
    }


    public void modifier(Offre_Emploi obj) {
        this.offre.findById(obj.getId())
                .map( item -> {
                    item.setDescription(obj.getDescription());
                    item.setDate_fin_validite(obj.getDate_fin_validite());
                    item.setExperience(obj.getExperience());
                    item.setTitle(obj.getTitle());
                    item.setProfil(obj.getProfil());
                    item.setVille(obj.getTitle());
                    item.setMetiers(obj.getMetiers());
                    item.setType_poste(obj.getType_poste());
                    return this.offre.save(item);
                }).orElseGet(() -> {
            obj.setId(obj.getId());
            return this.offre.save(obj);
        });
    }


    public Optional<Offre_Emploi> findById(Integer id) {
        return offre.findById(id);
    }

    public void deleteById(Integer id) {
        offre.deleteById(id);
    }

    public void deleteAll() {
        offre.deleteAll();
    }
}
