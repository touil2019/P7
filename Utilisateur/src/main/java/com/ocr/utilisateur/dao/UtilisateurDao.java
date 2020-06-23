package com.ocr.utilisateur.dao;


import com.ocr.utilisateur.model.UtilisateurLivre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UtilisateurDao extends JpaRepository<UtilisateurLivre, Long> {

   List<UtilisateurLivre> findAll();

   Optional<UtilisateurLivre> findByUsername(String username);
}
