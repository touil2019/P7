package com.ocr.livre.web.controller;


import com.ocr.livre.dao.LivreDao;
import com.ocr.livre.model.Livre;
import com.ocr.livre.web.exceptions.LivreNotFoundException;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class LivreController {

    @Autowired
    private LivreDao livreDao;


    Logger log = (Logger) LoggerFactory.getLogger(this.getClass());


    // Affiche la liste de tous les livres disponibles

    @GetMapping(value = "Livres")
    public List<Livre> Listelivres() {

        List<Livre> livres = livreDao.findAll();

        if (livres.isEmpty()) throw new LivreNotFoundException("Aucun livre n'est disponible à l'emprunt");


        log.info("Récupération de la liste des livres");

        return livres;

    }
    //Récuperer un livre par son id

    @GetMapping(value = "Livres/{id}")
    public Livre recupererUnLivre(@PathVariable int id) {

        Livre livre = livreDao.findById(id);

        if (!recupererUnLivre(id).isPresent())
            throw new LivreNotFoundException("Le livre correspondant à l'id " + id + " n'existe pas");

        return livre;
    }

    //Enregistrer un nouveau livre

    @PostMapping(value = "/Livres")
    public void ajouterLivre(@RequestBody Livre livre){
        livreDao.save(livre);
    }
}

