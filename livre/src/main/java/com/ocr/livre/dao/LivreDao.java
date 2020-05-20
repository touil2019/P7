package com.ocr.livre.dao;


import com.ocr.livre.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivreDao extends JpaRepository<Livre, Integer> {
        }
