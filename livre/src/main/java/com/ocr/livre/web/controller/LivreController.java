package com.ocr.livre.web.controller;

import com.projet7.microservicelivre.model.Livre;

import java.util.List;
import java.util.Optional;

public class LivreController {

    // Affiche la liste de tous les livres disponibles
    @GetMapping(value = "/Livres")
    public List<Livre> listeDesProduits(){

        List<Livre> livres = LivreDao.findAll();

        if(livres.isEmpty()) throw new LivreNotFoundException("Aucun livre n'est disponible à l'emprunt");

        log.info("Récupération de la liste des livres");

        return livres;

    }
    //Récuperer un livre par son id
    @GetMapping( value = "/Livre/{id}")
    public Livre recupererUnLivre(@PathVariable int id) {

        Optional<Livre> l = LivreDao.findById(id);

        Livre livre = null ;

        if(l.isPresent()){

            livre = l.get();
        }

        return livre;
    }
}
