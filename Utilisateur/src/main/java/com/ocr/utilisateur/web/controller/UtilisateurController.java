package com.ocr.utilisateur.web.controller;


import com.ocr.utilisateur.dao.UtilisateurDao;
import com.ocr.utilisateur.model.UtilisateurLivre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class UtilisateurController {

    @Autowired
    private UtilisateurDao utilisateurDao;

    @GetMapping("/all-account")
    public List<UtilisateurLivre> utilLivreList (){
        List<UtilisateurLivre> utilLivres = utilisateurDao.findAll();

        return utilLivres;
    }

    @GetMapping("/{username}/login")
    public UtilisateurLivre login (@PathVariable String username){
        Optional<UtilisateurLivre> u = utilisateurDao.findByUsername(username);
        UtilisateurLivre utilisateurLivre=null;
        if (u.isPresent()) {
            utilisateurLivre = u.get();
        }
        return utilisateurLivre;
    }

    @PostMapping(value = "/registerPost")
    public UtilisateurLivre register(@RequestBody UtilisateurLivre utilLivre) {
        utilisateurDao.save(utilLivre);
        return utilLivre;
    }


}

