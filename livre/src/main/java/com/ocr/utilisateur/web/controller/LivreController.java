package com.ocr.utilisateur.web.controller;


import com.ocr.utilisateur.dao.LivreDao;
import com.ocr.utilisateur.model.Livre;
import com.ocr.utilisateur.web.exceptions.LivreNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class LivreController {

    @Autowired
    private LivreDao livreDao;

    // Affiche la liste de tous les livres disponibles

    @GetMapping(value = "/Livres")
    public List<Livre> Listelivres() {

        List<Livre> livres = livreDao.findAll();

        if (livres.isEmpty()) throw new LivreNotFoundException("Aucun livre n'est disponible à l'emprunt");

        return livres;

    }
    //Récuperer un livre par son id

    @GetMapping(value = "/Livre/{id}")
    public Livre recupererUnLivre(@PathVariable long id) {

        Livre livre = livreDao.findById(id).get();

        if (!recupererUnLivre(id).isPresent())
            throw new LivreNotFoundException("Le livre correspondant à l'id " + id + " n'existe pas");

        return livre;
    }


}

