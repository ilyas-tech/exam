package com.controle.nissoul.Dao;

import com.controle.nissoul.Models.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Edao extends JpaRepository<Entreprise, Integer> {
}
