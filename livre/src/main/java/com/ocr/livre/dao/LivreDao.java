package com.ocr.livre.dao;


import com.ocr.livre.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivreDao extends JpaRepository<Livre, Integer> {

        public static List<Livre> findAll();

        public LivrefindByid(int id) {

        }

        void LivrefindByid(int id);
}
