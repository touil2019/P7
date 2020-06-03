package com.ocr.livre.dao;


import com.ocr.livre.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivreDao extends JpaRepository<Livre, Integer> {

   public List<Livre> findAll();

   public Livre findById(int id);


}
