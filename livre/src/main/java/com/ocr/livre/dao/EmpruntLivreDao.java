package com.ocr.livre.dao;


import com.ocr.livre.model.Emprunt;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EmpruntLivreDao extends JpaRepository<Emprunt, Long> {

}
