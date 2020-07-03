package com.ocr.livre.dao;


import com.ocr.livre.model.Emprunt;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;


public interface EmpruntLivreDao extends JpaRepository<Emprunt, Long> {

    List<Emprunt> findAll();

    Optional<Emprunt> findById(Long idEmprunt);
    

    List<Emprunt> findAllByPseudoEmprunteurAndEnCoursIsTrue(String pseudoEmprunteur);

    List<Emprunt> findAllByEnCoursTrueAndDateFinBefore(Date dateDuJour);
}
