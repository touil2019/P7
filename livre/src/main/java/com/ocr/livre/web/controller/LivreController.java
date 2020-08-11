package com.ocr.livre.web.controller;


import com.ocr.livre.dao.LivreDao;
import com.ocr.livre.model.Livre;
import com.ocr.livre.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class LivreController {

    @Autowired
    private LivreDao livreDao;


    @Autowired
    LivreService livreService ;



    @GetMapping(value = "/Livres")
    public List<Livre> listeLivre(){
        return livreService.findAll();
    }


    @GetMapping(value = "/listeRecherche")
    public List<Livre> listeLivreRecherche(@RequestParam(name = "mc",defaultValue = "")String mc){

        return livreService.findByTitreContainingIgnoreCase(mc);
    }


    @GetMapping(value = "/Livre/{id}")
    public Livre findById(@PathVariable("id")Long idLidvre){
        return livreService.findLivreById(idLidvre);
    }


    @PostMapping(value ="/livre/enregistrer")
    public Livre enregistrerNouveauLivre(@RequestBody Livre livre){
         return livreService.enregistrerNouveauLivre(livre);
    }


    @GetMapping(value = "/livre/supprimer/{id}")
    public void supprimerLivre(@PathVariable ("id") Long idLivre){
       livreService.supprimerLivre(idLivre);
    }

}

