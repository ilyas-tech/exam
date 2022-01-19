package com.controle.nissoul.Dao;

import com.controle.nissoul.Models.Offre_Emploi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Odao extends JpaRepository<Offre_Emploi, Integer> {
}
