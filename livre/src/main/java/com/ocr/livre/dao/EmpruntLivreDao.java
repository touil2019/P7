package com.ocr.livre.dao;


import com.ocr.livre.model.Email;
import com.ocr.livre.model.Emprunt;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;


public interface EmpruntLivreDao extends JpaRepository<Emprunt, Long> {

    List<Emprunt> findAllByPseudoEmprunteurAndEnCoursIsTrue(String nom_Utilisateur);


    List<Emprunt> findAllByEnCoursTrueAndDateFinBefore(Date dateemprunt);
}
