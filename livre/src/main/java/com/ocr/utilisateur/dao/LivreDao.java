package com.ocr.utilisateur.dao;


import com.ocr.utilisateur.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivreDao extends JpaRepository<Livre, Long> {

   public List<Livre> findAll();

   public Livre findById(int id);


}
