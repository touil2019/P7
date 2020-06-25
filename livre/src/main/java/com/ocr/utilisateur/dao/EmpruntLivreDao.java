package com.ocr.utilisateur.dao;


import com.ocr.utilisateur.model.EmpruntLivre;
import com.ocr.utilisateur.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmpruntLivreDao extends JpaRepository<EmpruntLivre, Long> {

}
