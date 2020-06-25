package com.ocr.livre.dao;


import com.ocr.livre.model.EmpruntLivre;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EmpruntLivreDao extends JpaRepository<EmpruntLivre, Long> {

}
