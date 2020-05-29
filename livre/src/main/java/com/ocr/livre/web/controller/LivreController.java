package com.ocr.livre.web.controller;


import com.ocr.livre.dao.LivreDao;
import com.ocr.livre.dao.LivreDaoImpl;
import com.ocr.livre.model.Livre;
import com.ocr.livre.web.exceptions.LivreNotFoundException;
import org.aspectj.bridge.MessageUtil;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
public class LivreController {

    Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

    // Affiche la liste de tous les livres disponibles
    @GetMapping(value = "/Livres")
    public List<Livre> livres(){

        List<Livre> livres = LivreDao.findAll();

        if(livres.isEmpty()) throw new LivreNotFoundException("Aucun livre n'est disponible à l'emprunt");


        log.info("Récupération de la liste des livres");

        return livres;

    }
    //Récuperer un livre par son id
    @GetMapping( value = "/Livre/{id}")
    public Livre recupererUnLivre(@PathVariable int id) {

        Optional<Livre> l;
        l = LivreDao.findById(id);

        Livre livre = null ;

        if(l.isPresent()){

            livre = l.get();
        }

        return livre;
    }
}
