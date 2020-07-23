package com.ocr.livre.web.controller;

import com.ocr.livre.LivreApplication;
import com.ocr.livre.model.Emprunt;
import com.ocr.livre.service.EmpruntService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmpruntController {

    private static final Logger logger = LogManager.getLogger(LivreApplication.class);

    @Autowired
    EmpruntService empruntService ;



    @GetMapping(value = "/emprunt/id/{idEmprunt}")
    public Optional<Emprunt> findById(@RequestParam Long idEmprunt){
        logger.debug("Appel controlleur findById emprunt");
        return empruntService.findById(idEmprunt);
    }

    @GetMapping(value = "/emprunt/pseudo/{pseudoEmprunteur}")
    public List<Emprunt> listeEmpruntUtilisateur(@PathVariable("pseudoEmprunteur") String pseudoEmprunteur){
        logger.debug("Appel controlleur listeEmpruntUtilisateur");
        return empruntService.findAllByPseudoEmprunteur(pseudoEmprunteur) ;
    }

    @PutMapping(value = "/emprunt/prolonger/{idEmprunt}")
    public ResponseEntity<Emprunt> prolongerEmprunt(@PathVariable("idEmprunt")Long idEmprunt){

        logger.debug("Appel controlleur prolongerEmprunt");

        Emprunt emprunt = empruntService.prolongerEmprunt(idEmprunt);

        if (emprunt != null){
            return ResponseEntity.ok(emprunt);
        }
        return new ResponseEntity(
                "Ne peut pas être prolongé",
                HttpStatus.BAD_REQUEST);
    }

    @PostMapping(value = "/emprunt/{idLivre}")
    public Emprunt ouvrirEmprunt(@PathVariable Long idLivre, @RequestParam String pseudoEmprunteur){

        logger.debug("Appel controlleur ouvrirEmprunt");

        return empruntService.ouvrirEmprunt(idLivre, pseudoEmprunteur);
    }

    @PutMapping(value = "emprunt/{idEmprunt}")
    public Emprunt cloturerEmprunt(@RequestParam Long idEmprunt){
        logger.debug("Appel controlleur cloturerEmprunt");
        return empruntService.cloturerEmprunt(idEmprunt);
    }


    @GetMapping(value = "/emprunt")
    public List<Emprunt> listeLivreNonRendueApresDateFin(){
        logger.debug("Appel controlleur listeLivreNonRendueApresDateFin");

        return empruntService.listeLivreNonRendueApresDateFin();
    }
}

