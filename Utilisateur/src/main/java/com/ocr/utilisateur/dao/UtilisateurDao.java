package com.ocr.utilisateur.dao;


import com.ocr.utilisateur.model.UtiLivre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UtilisateurDao extends JpaRepository<UtiLivre, Long> {

   List<UtiLivre> findAll();

   Optional<UtiLivre> findByUsername(String username);
}
