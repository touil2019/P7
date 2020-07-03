package com.ocr.livre.dao;


import com.ocr.livre.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivreDao extends JpaRepository<Livre, Long> {

   List<Livre> findAll();

   List<Livre> findByTitreContainingIgnoreCase(String mc);

   Livre enregistrerNouveauLivre(Livre livre);

   void supprimerLivre(Long livre);

   Livre findLivreById(Long idLidvre);
}
