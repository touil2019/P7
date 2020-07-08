package com.ocr.livre.dao;


import com.ocr.livre.model.Emprunt;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;


public interface EmpruntLivreDao extends JpaRepository<Emprunt, Long> {

    List<Emprunt> findAll();

    Optional<Emprunt> findById(Long idEmprunt);



    List<Emprunt> findAllByPseudoEmprunteurAndCloturerIsFalse(String pseudoEmprunteur);

    List<Emprunt> findAllByCloturerIsFalseAndDateFinBefore(Date dateDuJour);


}
