package com.ocr.livre.dao;


import com.ocr.livre.model.Emprunt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;


public interface EmpruntLivreDao extends JpaRepository<Emprunt, Long> {



    Optional<Emprunt> findById(Long idEmprunt);

    List<Emprunt> findAllByPseudoEmprunteurAndCloturerIsFalseOrderByDateDebutAsc(String pseudoEmprunteur);

    List<Emprunt> findAllByCloturerIsFalseAndDateFinBefore(Date dateDuJour);

    @Query(value = "select e from Emprunt e inner join fetch e.livre l where l.titre=:titre and e.cloturer=false",
            countQuery="select count (e) from Emprunt e inner join e.livre l where l.titre=:titre and e.cloturer=false")
    List<Emprunt> listeDEmpruntActifParLivre(String titre);
}
