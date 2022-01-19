package com.controle.nissoul.Services;


import com.controle.nissoul.Dao.Edao;
import com.controle.nissoul.Models.Entreprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Eservices {

    @Autowired
    private Edao entrepriseDao;


    public List<Entreprise> findAll() {
        return entrepriseDao.findAll();
    }

    public void modifier(Entreprise obj) {
        this.entrepriseDao.findById(obj.getId())
                .map( item -> {
                    item.setEmail(obj.getEmail());
                    item.setIce(obj.getIce());
                    item.setIF(obj.getIF());
                    item.setNom(obj.getNom());
                    item.setRc(obj.getRc());
                    item.setNbr_offre_publie(obj.getNbr_offre_publie());
                    item.setSiege(obj.getSiege());
                    item.setTel(obj.getTel());
                    item.setStatus(obj.getStatus());
                  //  item.setOffre_emplois(obj.getOffre_emplois());
                    return this.entrepriseDao.save(item);
                }).orElseGet(() -> {
            obj.setId(obj.getId());
            return this.entrepriseDao.save(obj);
        });
    }

    public int save(Entreprise emp) {
         //entrepriseDao.save(emp);

        if(emp == null ) return  -1;
        else{
            entrepriseDao.save(emp);
            return 1;
        }
    }

    public Optional<Entreprise> findById(Integer id) {
        return entrepriseDao.findById(id);
    }

    public void deleteById(Integer id) {
        entrepriseDao.deleteById(id);
    }

    public void deleteAll() {
        entrepriseDao.deleteAll();
    }
}
