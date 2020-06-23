package com.ocr.utilisateur.web.controller;


import com.ocr.utilisateur.dao.UtilisateurDao;
import com.ocr.utilisateur.model.UtiLivre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class UtilisateurController {

    @Autowired
    private UtilisateurDao utilisateurDao;

    @GetMapping("/all-account")
    public List<UtiLivre> utilLivreList (){
        List<UtiLivre> utilLivres = utilisateurDao.findAll();

        return utilLivres;
    }

    @GetMapping("/{username}/login")
    public Optional<UtiLivre> login (@PathVariable String username){
        Optional<UtiLivre> userBook = utilisateurDao.findByUsername(username);
        return userBook;
    }

    @PostMapping(value = "/registerPost")
    public UtiLivre register(@RequestBody UtiLivre utilLivre) {
        utilisateurDao.save(utilLivre);
        return utilLivre;
    }


}

